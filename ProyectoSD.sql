
create database peers;
use peers;

create table peers(
IP text(15) not null,
Host_name text not null,
PRIMARY KEY (IP(15)));

create table registros(
no_registro int(5) not null,
IP text not null,
Archivo text not null,
Porcentaje int not null,
Estado text not null,
PRIMARY KEY (no_registro))
ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1;

insert into registros (no_registro, IP, Archivo, Porcentaje,Estado)
	values('1','127.0.0.1', 'Busqueda', 100,'on');
insert into registros (no_registro, IP, Archivo, Porcentaje,Estado)
	values('2','127.0.0.1', 'Registrar', 100,'on');
insert into registros (no_registro, IP, Archivo, Porcentaje,Estado)
	values('3','127.0.0.1', 'Descarga', 100,'on');
insert into registros (no_registro, IP, Archivo, Porcentaje,Estado)
	values('4','127.0.0.1', 'Disponibles', 100,'on');

select * from peers;   
select * from registros; 

select *from registros where no_registro='1';

update registros Set Estado='on' where no_registro='1';

update registros Set Estado='on' where IP='127.0.0.1';

select IP from registros where Archivo = 'Busqueda' && Porcentaje >= 50 && Estado = 'on';

update registros Set Estado='on' where IP='192.168.1.70';
