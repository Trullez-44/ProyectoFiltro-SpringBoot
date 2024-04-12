INSERT INTO users (email, pwd) VALUES ('kevinadmin@gmail.com', 'to_be_encoded');

INSERT INTO roles (role_name, description, id_user) VALUES ('ROLE_ADMIN', 'can view every endpoint',1);

-- clientes

-- Insertar un nuevo cliente colombiano
INSERT INTO clientes (nombre, apellido, telefono) VALUES ('Juan', 'Gómez', '3112345678');

-- Insertar otro cliente colombiano
INSERT INTO clientes (nombre, apellido, telefono) VALUES ('María', 'Rodríguez', '3209876543');

-- Insertar un cliente colombiano sin teléfono
INSERT INTO clientes (nombre, apellido) VALUES ('Carlos', 'López');

-- Insertar un cliente colombiano con un nombre largo
INSERT INTO clientes (nombre, apellido, telefono) VALUES ('Alejandra', 'Hernández', '3101122334');

-- Insertar un cliente colombiano con un apellido largo
INSERT INTO clientes (nombre, apellido, telefono) VALUES ('Andrés', 'Gutiérrez Gómez', '3004455667');

-- Insertar Villa 1
INSERT INTO villas (urbanziacion, superficie_m2, direccion, habitaciones, baños, aseos, cocinas, gas, ciudad, puerta_blindada, parqueadero, zona) 
VALUES ('Villa del Sol', 250, 'Carrera 10 #25-30', 3, 2, 1, 1, true, 'Bogotá', true, false, 'Centro');

-- Insertar Villa 2
INSERT INTO villas (urbanziacion, superficie_m2, direccion, habitaciones, baños, aseos, cocinas, gas, ciudad, puerta_blindada, parqueadero, zona) 
VALUES ('Villa Campestre', 400, 'Calle 20 #15-50', 5, 4, 2, 1, false, 'Cali', false, true, 'Norte');

-- Insertar Villa 3
INSERT INTO villas (urbanziacion, superficie_m2, direccion, habitaciones, baños, aseos, cocinas, gas, ciudad, puerta_blindada, parqueadero, zona) 
VALUES ('Villa Primavera', 300, 'Avenida Sur #45-60', 4, 3, 2, 2, true, 'Medellín', true, true, 'Sur');

-- Insertar Villa 4
INSERT INTO villas (urbanziacion, superficie_m2, direccion, habitaciones, baños, aseos, cocinas, gas, ciudad, puerta_blindada, parqueadero, zona) 
VALUES ('Villa Los Pinos', 350, 'Carrera 5 #30-15', 4, 3, 1, 1, true, 'Barranquilla', true, true, 'Este');

-- Insertar Villa 5
INSERT INTO villas (urbanziacion, superficie_m2, direccion, habitaciones, baños, aseos, cocinas, gas, ciudad, puerta_blindada, parqueadero, zona) 
VALUES ('Villa El Bosque', 280, 'Calle 40 #10-25', 3, 2, 1, 1, false, 'Cartagena', false, false, 'Oeste');

-- Insertar Inmueble 1 asociado con Villa 1
INSERT INTO inmuebles (alquiler, n_referencia, nombre_propietario, precio_alquier, precio_venta, telefono_cliente, tipo_inmueble, venta, villa) 
VALUES (false, 'REF001', 'María González', NULL, 350000, '3118765432', 'VILLA', true, 1);

-- Insertar Inmueble 2 asociado con Villa 2
INSERT INTO inmuebles (alquiler, n_referencia, nombre_propietario, precio_alquier, precio_venta, telefono_cliente, tipo_inmueble, venta, villa) 
VALUES (true, 'REF002', 'Juan Rodríguez', 1500000, NULL, '3109876543', 'VILLA', false, 2);

-- Insertar Inmueble 3 asociado con Villa 3
INSERT INTO inmuebles (alquiler, n_referencia, nombre_propietario, precio_alquier, precio_venta, telefono_cliente, tipo_inmueble, venta, villa) 
VALUES (false, 'REF003', 'Luisa Martínez', NULL, 450000, '3123456789', 'VILLA', true, 3);

-- Insertar Inmueble 4 asociado con Villa 4
INSERT INTO inmuebles (alquiler, n_referencia, nombre_propietario, precio_alquier, precio_venta, telefono_cliente, tipo_inmueble, venta, villa) 
VALUES (true, 'REF004', 'Carlos López', 1800000, NULL, '3176543210', 'VILLA', false, 4);

-- Insertar Inmueble 5 asociado con Villa 5
INSERT INTO inmuebles (alquiler, n_referencia, nombre_propietario, precio_alquier, precio_venta, telefono_cliente, tipo_inmueble, venta, villa) 
VALUES (false, 'REF005', 'Ana Ramírez', NULL, 400000, '3145678901', 'VILLA', true, 5);
