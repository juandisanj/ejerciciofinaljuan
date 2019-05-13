create table FIchaje_Fichaje (
	uuid_ VARCHAR(75) null,
	fichajeId LONG not null primary key,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	horaEntrada DATE null,
	horaSalida DATE null,
	horas DOUBLE
);

create table FIchaje_Servicio (
	idServicio LONG not null primary key,
	activo BOOLEAN,
	horaInicio DATE null,
	horaFin DATE null,
	longitud DOUBLE,
	latitud DOUBLE,
	idTipoServicio LONG,
	fichajeId LONG
);

create table FIchaje_TipoServicio (
	idTipoServicio LONG not null primary key,
	nombre VARCHAR(75) null,
	computa BOOLEAN
);

create table FOO_Fichaje (
	uuid_ VARCHAR(75) null,
	fichajeId LONG not null primary key,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	horaEntrada DATE null,
	horaSalida DATE null,
	horas DOUBLE
);

create table FOO_Servicio (
	idServicio LONG not null primary key,
	activo BOOLEAN,
	horaInicio DATE null,
	horaFin DATE null,
	tipoServicio LONG,
	longitud DOUBLE,
	latitud DOUBLE
);

create table FOO_TipoServicio (
	idTipoServicio LONG not null primary key,
	nombre VARCHAR(75) null,
	computa BOOLEAN
);