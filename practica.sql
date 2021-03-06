Create table Album(
id_Album int not null auto_increment,
nombre varchar(45),
cantidadMaxima int,
fechaCreacion date,
primary key(id_Album));

Create table Foto(
id_Foto int not null auto_increment,
id_Album int not null,
descripcion varchar(45),
nombreArchivo varchar(45),
tamaño int,
primary key(id_Foto),
foreign key(id_Album) references Album(id_Album));

insert into foto(id_Album,descripcion,nombreArchivo,tamaño) values(4,"Cordoba","null",2042);

select * from Foto

select f.nombreArchivo,f.tamaño,a.nombre from Album as a inner join Foto as f on a.id_Album = f.id_Foto
where f.tamaño >= 1024
order by tamaño desc