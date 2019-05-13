create table Fichaje_Fichaje (
	uuid_ VARCHAR(75) null,
	fichajeId LONG not null primary key,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	horaEntrada DATE null,
	horaSalida DATE null,
	horas DOUBLE
);

create table Fichaje_Servicio (
	idServicio LONG not null primary key,
	activo BOOLEAN,
	horaInicio DATE null,
	horaFin DATE null,
	longitud DOUBLE,
	latitud DOUBLE,
	idTipoServicio LONG,
	fichajeId LONG
);

create table Fichaje_TipoServicio (
	idTipoServicio LONG not null primary key,
	nombre VARCHAR(75) null,
	computa BOOLEAN
);