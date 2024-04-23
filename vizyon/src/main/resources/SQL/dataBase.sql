CREATE DATABASE  IF NOT EXISTS vizyon;
USE vizyon;

CREATE TABLE pais (
  id INT NOT NULL AUTO_INCREMENT,
  nombre VARCHAR(255) DEFAULT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE departamento (
  id INT NOT NULL AUTO_INCREMENT,
  nombre VARCHAR(255) DEFAULT NULL,
  id_pais_fk INT DEFAULT NULL,
  PRIMARY KEY (id),
  KEY FKhrc8gob1omeqjfvld38h021w7 (id_pais_fk),
  CONSTRAINT FKhrc8gob1omeqjfvld38h021w7 FOREIGN KEY (id_pais_fk) REFERENCES pais (id)
);

CREATE TABLE municipio (
  id INT NOT NULL AUTO_INCREMENT,
  nombre VARCHAR(255) DEFAULT NULL,
  id_departamento_fk INT DEFAULT NULL,
  PRIMARY KEY (id),
  KEY FKaclbc9bgftjfgop8do4vmvsc7 (id_departamento_fk),
  CONSTRAINT FKaclbc9bgftjfgop8do4vmvsc7 FOREIGN KEY (id_departamento_fk) REFERENCES departamento (id)
);
CREATE TABLE tipo_persona (
  id INT NOT NULL AUTO_INCREMENT,
  nombre VARCHAR(255) DEFAULT NULL,
  PRIMARY KEY (id)
);
CREATE TABLE cliente (
  id INT NOT NULL AUTO_INCREMENT,
  fecha_registro DATE DEFAULT NULL,
  id_cliente INT DEFAULT NULL,
  nombre VARCHAR(255) DEFAULT NULL,
  id_municipio_fk INT DEFAULT NULL,
  id_tipo_persona_fk INT DEFAULT NULL,
  PRIMARY KEY (id),
  KEY FKsdo3ywtb6phxyrj9bfjrhvjae (id_municipio_fk),
  KEY FKfk56e5y2lwtost3splbgf774h (id_tipo_persona_fk),
  CONSTRAINT FKfk56e5y2lwtost3splbgf774h FOREIGN KEY (id_tipo_persona_fk) REFERENCES tipo_persona (id),
  CONSTRAINT FKsdo3ywtb6phxyrj9bfjrhvjae FOREIGN KEY (id_municipio_fk) REFERENCES municipio (id)
);

CREATE TABLE cargos (
  id INT NOT NULL AUTO_INCREMENT,
  descripcion VARCHAR(255) DEFAULT NULL,
  sueldo_base DOUBLE DEFAULT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE empleado (
  id INT NOT NULL AUTO_INCREMENT,
  fecha_ingreso DATE DEFAULT NULL,
  nombre VARCHAR(255) DEFAULT NULL,
  id_cargo_fk INT DEFAULT NULL,
  id_municipio_fk INT DEFAULT NULL,
  PRIMARY KEY (id),
  KEY FKgucqo1s8rpxuis0cmc7xi826t (id_cargo_fk),
  KEY FK1couweojuq4xb37nue0lv3nt4 (id_municipio_fk),
  CONSTRAINT FK1couweojuq4xb37nue0lv3nt4 FOREIGN KEY (id_municipio_fk) REFERENCES municipio (id),
  CONSTRAINT FKgucqo1s8rpxuis0cmc7xi826t FOREIGN KEY (id_cargo_fk) REFERENCES cargos (id)
);



CREATE TABLE empresa (
  id INT NOT NULL AUTO_INCREMENT,
  fecha_creacion DATE DEFAULT NULL,
  nit VARCHAR(255) DEFAULT NULL,
  razon_social VARCHAR(255) DEFAULT NULL,
  representante_legal VARCHAR(255) DEFAULT NULL,
  id_municipio_fk INT DEFAULT NULL,
  PRIMARY KEY (id),
  KEY FKe0l0x3n4his0n6r0a6igdtmj (id_municipio_fk),
  CONSTRAINT FKe0l0x3n4his0n6r0a6igdtmj FOREIGN KEY (id_municipio_fk) REFERENCES municipio (id)
);

CREATE TABLE proveedor (
  id INT NOT NULL AUTO_INCREMENT,
  nit_proveedor VARCHAR(255) DEFAULT NULL,
  nombre VARCHAR(255) DEFAULT NULL,
  id_municipiofk INT DEFAULT NULL,
  id_tipo_persona INT DEFAULT NULL,
  PRIMARY KEY (id),
  KEY FKpyq9qjynd3otmknoo95dra5nu (id_municipio_fk),
  KEY FKisy7lss0v5vitkfp1r91oljde (id_tipo_persona),
  CONSTRAINT FKisy7lss0v5vitkfp1r91oljde FOREIGN KEY (id_tipo_persona) REFERENCES tipo_persona (id),
  CONSTRAINT FKpyq9qjynd3otmknoo95dra5nu FOREIGN KEY (id_municipiofk) REFERENCES municipio (id)
);
CREATE TABLE tipo_estado (
  id INT NOT NULL AUTO_INCREMENT,
  descripcion VARCHAR(255) DEFAULT NULL,
  PRIMARY KEY (id)
);
CREATE TABLE estado (
  id INT NOT NULL AUTO_INCREMENT,
  descripcion VARCHAR(255) DEFAULT NULL,
  id_tipo_estado_fk INT DEFAULT NULL,
  PRIMARY KEY (id),
  KEY FK7p6et4nv5mhgcicw8fauoby0k (id_tipo_estado_fk),
  CONSTRAINT FK7p6et4nv5mhgcicw8fauoby0k FOREIGN KEY (id_tipo_estado_fk) REFERENCES tipo_estado (id)
);

CREATE TABLE tipo_proteccion (
  id INT NOT NULL AUTO_INCREMENT,
  descripcion VARCHAR(255) DEFAULT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE genero (
  id INT NOT NULL AUTO_INCREMENT,
  descripcion VARCHAR(255) DEFAULT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE prenda (
  id INT NOT NULL AUTO_INCREMENT,
  codigo VARCHAR(255) DEFAULT NULL,
  nombre VARCHAR(255) DEFAULT NULL,
  valor_unit_cop DOUBLE DEFAULT NULL,
  valor_unit_usd DOUBLE DEFAULT NULL,
  id_estado_fk INT DEFAULT NULL,
  id_genero_fk INT DEFAULT NULL,
  id_tipo_proteccion INT DEFAULT NULL,
  PRIMARY KEY (id),
  KEY FK7ja6h4vlhtul49t7dh0ieb5j (id_estado_fk),
  KEY FKt62hpk18h89b36bwa7b7543se (id_genero_fk),
  KEY FK2yn1rsyku10j5yx31t5nvvyyo (id_tipo_proteccion),
  CONSTRAINT FK2yn1rsyku10j5yx31t5nvvyyo FOREIGN KEY (id_tipo_proteccion) REFERENCES tipo_proteccion (id),
  CONSTRAINT FK7ja6h4vlhtul49t7dh0ieb5j FOREIGN KEY (id_estado_fk) REFERENCES estado (id),
  CONSTRAINT FKt62hpk18h89b36bwa7b7543se FOREIGN KEY (id_genero_fk) REFERENCES genero (id)
);



CREATE TABLE inventario (
  id INT NOT NULL AUTO_INCREMENT,
  cod_inv VARCHAR(255) DEFAULT NULL,
  valor_vta_cop DOUBLE DEFAULT NULL,
  valor_vta_usd DOUBLE DEFAULT NULL,
  id_prenda_fk INT DEFAULT NULL,
  PRIMARY KEY (id),
  KEY FKrlg2ga4cwffpdbhqbwpvjd7gs (id_prenda_fk),
  CONSTRAINT FKrlg2ga4cwffpdbhqbwpvjd7gs FOREIGN KEY (id_prenda_fk) REFERENCES prenda (id)
);

CREATE TABLE talla (
  id INT NOT NULL AUTO_INCREMENT,
  descripcion VARCHAR(255) DEFAULT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE inventario_talla (
  id_inv_fk INT NOT NULL,
  id_talla_fk INT NOT NULL,
  PRIMARY KEY (id_inv_fk,id_talla_fk),
  KEY FKh15jjlu1mqq494bxe3byy93lk (id_talla_fk),
  CONSTRAINT FK4yn65nyslgpj4as3ylui7j0p2 FOREIGN KEY (id_inv_fk) REFERENCES inventario (id),
  CONSTRAINT FKh15jjlu1mqq494bxe3byy93lk FOREIGN KEY (id_talla_fk) REFERENCES talla (id)
);
CREATE TABLE orden (
  id int NOT NULL AUTO_INCREMENT,
  fecha date DEFAULT NULL,
  id_cliente_fk int DEFAULT NULL,
  id_empleado_fk int DEFAULT NULL,
  id_estado_fk int DEFAULT NULL,
  PRIMARY KEY (id),
  KEY FKru3iel8cpwg0e45uej3knyq4u (id_cliente_fk),
  KEY FKm7mli66iy1mi4jruckoxf6q45 (id_empleado_fk),
  KEY FKgg6990ph7rgbcvn3iev1qr93g (id_estado_fk),
  CONSTRAINT FKgg6990ph7rgbcvn3iev1qr93g FOREIGN KEY (id_estado_fk) REFERENCES estado (id),
  CONSTRAINT FKm7mli66iy1mi4jruckoxf6q45 FOREIGN KEY (id_empleado_fk) REFERENCES empleado (id),
  CONSTRAINT FKru3iel8cpwg0e45uej3knyq4u FOREIGN KEY (id_cliente_fk) REFERENCES cliente (id)
) ;

CREATE TABLE color (
  id INT NOT NULL AUTO_INCREMENT,
  descripcion VARCHAR(255) DEFAULT NULL,
  PRIMARY KEY (id)
);
CREATE TABLE detalle_orden (
  id INT NOT NULL AUTO_INCREMENT,
  cantidad_producida INT DEFAULT NULL,
  cantidad_producir INT DEFAULT NULL,
  id_color_fk INT DEFAULT NULL,
  id_estado_fk INT DEFAULT NULL,
  id_orden_fk INT DEFAULT NULL,
  id_prenda_fk INT DEFAULT NULL,
  PRIMARY KEY (id),
  KEY FKsknour0iqp6arvbggqxnxqj9k (id_color_fk),
  KEY FKb5p3x45kki2mlq8bwxegllbbj (id_estado_fk),
  KEY FK9dp3t1iiimocsjmx1epjjj1g0 (id_orden_fk),
  KEY FK4mgds25oawoqk3xte9bqaulvb (id_prenda_fk),
  CONSTRAINT FK4mgds25oawoqk3xte9bqaulvb FOREIGN KEY (id_prenda_fk) REFERENCES prenda (id),
  CONSTRAINT FK9dp3t1iiimocsjmx1epjjj1g0 FOREIGN KEY (id_orden_fk) REFERENCES orden (id),
  CONSTRAINT FKb5p3x45kki2mlq8bwxegllbbj FOREIGN KEY (id_estado_fk) REFERENCES estado (id),
  CONSTRAINT FKsknour0iqp6arvbggqxnxqj9k FOREIGN KEY (id_color_fk) REFERENCES color (id)
);


CREATE TABLE forma_pago (
  id INT NOT NULL AUTO_INCREMENT,
  descripcion VARCHAR(255) DEFAULT NULL,
  PRIMARY KEY (id)
);
CREATE TABLE venta (
  id INT NOT NULL AUTO_INCREMENT,
  fecha DATE DEFAULT NULL,
  id_cliente_fk INT DEFAULT NULL,
  id_empleado_fk INT DEFAULT NULL,
  id_forma_pago_fk INT DEFAULT NULL,
  PRIMARY KEY (id),
  KEY FK4692vip1l4tq8gad6dqtm2d5g (id_cliente_fk),
  KEY FK4j8ovs4ffx01wtwr4x34wvufn (id_empleado_fk),
  KEY FKa106k9e509dt280ngt87jewgj (id_forma_pago_fk),
  CONSTRAINT FK4692vip1l4tq8gad6dqtm2d5g FOREIGN KEY (id_cliente_fk) REFERENCES cliente (id),
  CONSTRAINT FK4j8ovs4ffx01wtwr4x34wvufn FOREIGN KEY (id_empleado_fk) REFERENCES empleado (id),
  CONSTRAINT FKa106k9e509dt280ngt87jewgj FOREIGN KEY (id_forma_pago_fk) REFERENCES forma_pago (id)
);


CREATE TABLE detalle_venta (
  id INT NOT NULL AUTO_INCREMENT,
  cantidad INT DEFAULT NULL,
  valor_unit DOUBLE DEFAULT NULL,
  id_producto_fk INT DEFAULT NULL,
  id_talla_fk INT DEFAULT NULL,
  id_venta_fk INT DEFAULT NULL,
  PRIMARY KEY (id),
  KEY FKam8fy5cntdhlhhla9fr911g3c (id_producto_fk),
  KEY FKfgro9wc6yipq1q3j5pg3rg732 (id_talla_fk),
  KEY FKim11hbp5tgmfdptu7wnytpa1u (id_venta_fk),
  CONSTRAINT FKam8fy5cntdhlhhla9fr911g3c FOREIGN KEY (id_producto_fk) REFERENCES inventario (id),
  CONSTRAINT FKfgro9wc6yipq1q3j5pg3rg732 FOREIGN KEY (id_talla_fk) REFERENCES talla (id),
  CONSTRAINT FKim11hbp5tgmfdptu7wnytpa1u FOREIGN KEY (id_venta_fk) REFERENCES venta (id)
);


CREATE TABLE insumo (
  id INT NOT NULL AUTO_INCREMENT,
  nombre VARCHAR(255) DEFAULT NULL,
  stock_max DOUBLE DEFAULT NULL,
  stock_min DOUBLE DEFAULT NULL,
  valor_unit DOUBLE DEFAULT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE insumo_prendas (
  cantidad INT DEFAULT NULL,
  id_insumo_fk INT NOT NULL,
  id_prenda_fk INT NOT NULL,
  PRIMARY KEY (id_insumo_fk,id_prenda_fk),
  KEY FKsd9yddc7jqex4w208wskc1ga9 (id_prenda_fk),
  CONSTRAINT FKp4mnrtpc8ur2kb6na7h7nbiuc FOREIGN KEY (id_insumo_fk) REFERENCES insumo (id),
  CONSTRAINT FKsd9yddc7jqex4w208wskc1ga9 FOREIGN KEY (id_prenda_fk) REFERENCES prenda (id)
);

CREATE TABLE insumo_proveedor (
  id_insumo_fk INT NOT NULL,
  id_proveedor_fk INT NOT NULL,
  PRIMARY KEY (id_insumo_fk,id_proveedor_fk),
  KEY FKb51meomhbkwd6khuhq3lti5d2 (id_proveedor_fk),
  CONSTRAINT FKb51meomhbkwd6khuhq3lti5d2 FOREIGN KEY (id_proveedor_fk) REFERENCES proveedor (id),
  CONSTRAINT FKc8nv2dsifyyboryophjquukyk FOREIGN KEY (id_insumo_fk) REFERENCES insumo (id)
);
