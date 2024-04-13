CREATE TABLE IF NOT EXISTS USERS (
    user_id BIGINT NOT NULL auto_increment,
    role VARCHAR (100),
    name VARCHAR(255),
    email VARCHAR(100),
    password VARCHAR (255),
    cpf VARCHAR(100),
    phone_number VARCHAR(100),
    company_id bigint not null,
    PRIMARY KEY (user_id),
    add constraint fk_company_user
    foreign key(company_id) references companys(id)
)