CREATE DATABASE cinemagic2;

USE cinemagic2;

CREATE TABLE horario(
	id_horario INT AUTO_INCREMENT PRIMARY KEY,
    dia INT,
    mes INT,
    anio INT,
    hora VARCHAR(5)
);

CREATE TABLE opiniones(
	id_opinion INT AUTO_INCREMENT PRIMARY KEY,
    calificacion INT,
    opinion VARCHAR(250)
);

CREATE TABLE asiento(
	id_asiento INT AUTO_INCREMENT PRIMARY KEY,
    fila INT,
    columna VARCHAR(1),
    disponibilidad BOOLEAN
);

CREATE TABLE pelicula(
	id_pelicula INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50),
    clasificacion VARCHAR(3),
    sinopsis VARCHAR(250),
    ventas INT,
    id_horario_fk INT,
    id_opiniones_fk INT,
    FOREIGN KEY(id_horario_fk) REFERENCES horario(id_horario),
    FOREIGN KEY(id_opiniones_fk) REFERENCES opiniones(id_opinion)
);

CREATE TABLE cartelera(
	id_cartelera INT AUTO_INCREMENT PRIMARY KEY,
    id_pelicula_fk INT,
    FOREIGN KEY(id_pelicula_fk) REFERENCES pelicula(id_pelicula)
);
-- DROP TABLE boleto;
CREATE TABLE boleto(
	id_boleto INT AUTO_INCREMENT PRIMARY KEY,
    metodo_pago VARCHAR(20),
    id_horario_fk INT,
    id_asiento_fk INT,
    id_pelicula_fk INT,
    FOREIGN KEY (id_horario_fk) REFERENCES horario(id_horario),
    FOREIGN KEY (id_asiento_fk) REFERENCES asiento(id_asiento),
    FOREIGN KEY (id_pelicula_fk) REFERENCES pelicula(id_pelicula)
);

-- DROP TABLE administrador;
CREATE TABLE administrador(
	id_administrador INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50),
    correo VARCHAR(50),
    contrasenia VARCHAR(50),
    id_cartelera_fk INT,
    FOREIGN KEY (id_cartelera_fk) REFERENCES cartelera(id_cartelera) 
);

 DROP TABLE espectador;
CREATE TABLE espectador(
	id_espectador INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(50),
	correo VARCHAR(50),
    telefono VARCHAR(10),
    passwd VARCHAR(8),
    id_boleto_fk INT,
    id_opinion_fk INT,
    FOREIGN KEY(id_boleto_fk) REFERENCES boleto(id_boleto),
    FOREIGN KEY(id_opinion_fk) REFERENCES opiniones(id_opinion)
);