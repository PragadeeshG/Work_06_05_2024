create table if not exists fast_payment_entity(
fast_payment_key Integer not null,
effective_date varchar(255) null,
institution_name Integer null,
office_type varchar(255) null,
parent_office_type varchar(255) null,
head_office_key varchar(255) null,
legal_type varchar(255) null,
entity_state varchar(255) null,
modified_date varchar(255) null,
remarks varchar(255) null,
constraint fast_payment_entity_pk primary key(fast_payment_key));