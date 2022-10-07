insert into type (code,title)
values ( 'cat', 'кошка'),
       ( 'dog', 'собака'),
       ( 'bird', 'птица'),
       ( 'fish', 'рыба'),
       ( 'turtle', 'черепашка');

insert into breed (  code ,title, type_id)
values ('mongrel_dog' , 'беспородная собака', (SELECT type.id FROM type WHERE type.code='dog')),
       ('persian','перс',(SELECT type.id FROM type WHERE type.code='cat')),
       ('mongrel_cat' , 'беспородная кошка', (SELECT type.id FROM type WHERE type.code='cat' )),
       ('labrador_retriever' , 'лабрадор', (SELECT type.id FROM type WHERE type.code='dog')),
       ('parrot' , 'попугай', (SELECT type.id FROM type WHERE type.code='bird')),
       ('red_eared_turtle' , 'красноухая черепаха', (SELECT type.id FROM type WHERE type.code='turtle') ),
       ('golden_fish' , 'золотая рыбка', (SELECT type.id FROM type WHERE type.code='fish') ),
       ('channel_catfish' , 'сом', (SELECT type.id FROM type WHERE type.code='fish')),
       ('central_asian_turtle' , 'среднеазиатская черепаха', (SELECT type.id FROM type WHERE type.code='turtle') ),
       ('duck' , 'утка', (SELECT type.id FROM type WHERE type.code='bird') );

 insert into specialization ( code, title )
 values ('surgeon' , 'хирург'),
        ('cardiologist' , 'кардиолог'),
        ('dentist' , 'стоматолог'),
        ('therapist' , 'терапевт');


