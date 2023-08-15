CREATE TABLE T_CF_USER (
  id_user INTEGER PRIMARY KEY,
  email VARCHAR2(45),
  password VARCHAR2(45),
  created_at DATE,
  updated_at DATE,
  deleted_at DATE
);
DROP TABLE T_CF_CLIENT;
CREATE TABLE T_CF_CLIENT (
  id_client INTEGER PRIMARY KEY,
  name VARCHAR(45),
  last_name VARCHAR(45),
  full_name VARCHAR(45),
  created_at TIMESTAMP,
  updated_at TIMESTAMP,
  deleted_at TIMESTAMP
);
CREATE TABLE T_CF_ORDER (
id_order INTEGER PRIMARY KEY,
created_at TIMESTAMP,
updated_at TIMESTAMP,
deleted_at TIMESTAMP
);
CREATE TABLE T_ORDER_STATUS (
id_order_status INTEGER PRIMARY KEY,
name VARCHAR(45),
created_at TIMESTAMP,
updated_at TIMESTAMP,
deleted_at TIMESTAMP
);
CREATE TABLE T_CF_PROBLEM (
id_problem INTEGER PRIMARY KEY,
name VARCHAR(45)
);
CREATE TABLE T_CF_VEHICLE (
id_vehicle INTEGER PRIMARY KEY,
transit_board VARCHAR(45),
height FLOAT,
width FLOAT,
lenght FLOAT,
weight FLOAT,
is_axle NUMBER,
created_at TIMESTAMP,
updated_at TIMESTAMP,
deleted_at TIMESTAMP
);
CREATE TABLE T_CF_MODAL_DRIVER (
id_modal_driver INTEGER PRIMARY KEY,
name VARCHAR(45),
last_name VARCHAR(45),
full_name VARCHAR(45),
cpf VARCHAR(45),
created_at TIMESTAMP,
updated_at TIMESTAMP,
deleted_at TIMESTAMP
);
CREATE TABLE T_CF_MODAL (
id_modal INTEGER PRIMARY KEY,
transit_board VARCHAR(45),
created_at TIMESTAMP,
updated_at TIMESTAMP,
deleted_at TIMESTAMP
);
CREATE TABLE T_CF_MODAL_CATEGORY (
id_modal_category INTEGER PRIMARY KEY,
name VARCHAR(45),
created_at TIMESTAMP,
updated_at TIMESTAMP,
deleted_at TIMESTAMP
);
CREATE TABLE T_CF_SUBSCRIPTION_PLAN (
id_subscription_plan INTEGER PRIMARY KEY,
name VARCHAR(45),
price FLOAT,
created_at TIMESTAMP,
updated_at TIMESTAMP,
deleted_at TIMESTAMP
);
ALTER TABLE T_CF_CLIENT 
   ADD CONSTRAINT id_user FOREIGN KEY (id_client)
   REFERENCES T_CF_ORDER ;





