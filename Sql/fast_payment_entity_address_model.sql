create table if not exists fast_payment_entity_address_model(
fast_payment_key Integer not null,
country_code varchar(255) null,
branch_info varchar(255) null,
city varchar(255) null,
state varchar(255) null,
creation_date varchar(255) null,
modified_date varchar(255) null,
entity_state varchar(255) null,
constraint fast_payment_entity_address_model_pk primary key(fast_payment_key));