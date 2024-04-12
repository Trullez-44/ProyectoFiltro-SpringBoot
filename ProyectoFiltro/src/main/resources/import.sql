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
