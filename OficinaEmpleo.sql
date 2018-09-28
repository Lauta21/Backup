create table Usuario(
id_usuario int not null auto_increment,
NombreUsuario nvarchar(50),
Contraseña nvarchar(50),
Nombre nvarchar(50),
Apellido nvarchar(50),
fecha date,
primary key (id_usuario));

create table AbstractPersona(
id_abstracpersona int not null auto_increment,
id_usuario int not null,
Nombre nvarchar(50),
Apellido nvarchar(50),
DNI nvarchar(50),
Cuil_Ciut nvarchar(50),
Sexo nvarchar(50),
Director nvarchar(50),
Distrito nvarchar(50),
TelPrincipal nvarchar(50),
TelAlternativo nvarchar(50),
Fecha_de_Nacimiento date,
Email nvarchar(50),
Edad nvarchar(50),
primary key(id_abstracpersona),
foreign key(id_usuario) references Usuario(id_usuario));

create table TipoActividad(
id_tipo_actividad int not null auto_increment,
id_usuario int not null,
Nombre nvarchar(50),
Descripcion nvarchar(20000),
primary key(id_tipo_actividad),
foreign key(id_usuario) references Usuario(id_usuario));

create table Empresa(
id_empresa int not null auto_increment,
id_usuario int not null,
id_abstracpersona int not null,
id_tipo_actividad int not null,
Razon_Social nvarchar(50),
Representante_Legal nvarchar(50),
Sede nvarchar(50),
Cantidad_Trabajadores int(50),
Fecha_Contacto date,
Tipo_Contacto nvarchar(50),
primary key(id_empresa),
foreign key(id_abstracpersona) references AbstractPersona(id_abstracpersona),
foreign key(id_tipo_actividad) references TipoActividad(id_tipo_actividad),
foreign key(id_usuario) references Usuario(id_usuario));

create table Programa(
id_programa int not null,
Nombre nvarchar(50),
Descripcion nvarchar(20000),
primary key(id_programa));

insert into Programa(id_programa,nombre,descripcion)values(4,"SCIE","");

create table NivelEducacion(
id_nivel_educacion int not null auto_increment,
id_usuario int not null,
Nombre nvarchar(50),
Descripcion nvarchar(20000),
primary key(id_nivel_educacion),
foreign key(id_usuario) references Usuario(id_usuario));

insert into NivelEducacion(id_nivel_educacion,nombre,descripcion)values(4,"Universitario","");

create table Perfil(
id_perfil int not null auto_increment,
id_usuario int not null,
Nombre nvarchar(50),
Descripcion nvarchar(20000),
primary key(id_perfil),
foreign key(id_usuario) references Usuario(id_usuario));

create table Postulante(
id_postulante int not null auto_increment,
id_usuario int not null,
id_programa int not null,
id_nivel_educacion int not null,
id_perfil int not null,
Movilidad nvarchar(50),
Disp_Horarios nvarchar(50),
Doc_Adicionales nvarchar(500),
primary key(id_postulante),
foreign key(id_programa) references Programa(id_programa),
foreign key(id_nivel_educacion) references NivelEducacion(id_nivel_educacion),
foreign key(id_perfil) references Perfil(id_perfil),
foreign key(id_usuario) references Usuario(id_usuario));

create table Curriculum(
id_curriculum int not null auto_increment,
id_usuario int not null,
id_postulante int not null,
id_abstracpersona int not null,
Experiencia nvarchar(10000),
Cursos nvarchar(10000),
primary key(id_curriculum),
foreign key(id_postulante) references Postulante(id_postulante),
foreign key(id_abstracpersona) references AbstractPersona(id_abstracpersona),
foreign key(id_usuario) references Usuario(id_usuario));

postulantealter table Programa
CHANGE pogama programa int not null
delete from NivelEducacion 

select * from NivelEducacion


 
