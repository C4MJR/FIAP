DROP TABLE T_CF_USER;
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
  deleted_at TIMESTAMP,
  id_user INTEGER,
  CONSTRAINT fk_user_client FOREIGN KEY (id_user) REFERENCES T_CF_USER (id_user)
);
DROP TABLE T_CF_ORDER;
CREATE TABLE T_CF_ORDER (
  id_order INTEGER PRIMARY KEY,
  id_modal_driver INTEGER,
  created_at TIMESTAMP,
  updated_at TIMESTAMP,
  deleted_at TIMESTAMP,
  id_client INTEGER,
  id_problem INTEGER,
  id_order_status INTEGER,
  CONSTRAINT fk_order_client FOREIGN KEY (id_client) REFERENCES T_CF_CLIENT (id_client),
  CONSTRAINT fk_order_problem FOREIGN KEY (id_problem) REFERENCES T_CF_PROBLEM (id_problem),
  CONSTRAINT fk_order_status FOREIGN KEY (id_order_status) REFERENCES T_ORDER_STATUS (id_order_status),
  CONSTRAINT fk_order_modal_driver FOREIGN KEY (id_modal_driver) REFERENCES T_CF_MODAL_DRIVER (id_modal_driver)
);
DROP TABLE T_ORDER_STATUS;
CREATE TABLE T_ORDER_STATUS (
id_order_status INTEGER PRIMARY KEY,
name VARCHAR(45),
created_at TIMESTAMP,
updated_at TIMESTAMP,
deleted_at TIMESTAMP
);
DROP TABLE T_CF_PROBLEM;
CREATE TABLE T_CF_PROBLEM (
id_problem INTEGER PRIMARY KEY,
name VARCHAR(45)
);
DROP TABLE T_CF_VEHICLE;
CREATE TABLE T_CF_VEHICLE (
  id_vehicle INTEGER PRIMARY KEY,
  transit_board VARCHAR(45),
  height INTEGER,
  width INTEGER,
  length INTEGER,
  weight INTEGER,
  is_axle INTEGER,
  created_at TIMESTAMP,
  updated_at TIMESTAMP,
  deleted_at TIMESTAMP,
  id_client INTEGER,
  FOREIGN KEY (id_client) REFERENCES T_CF_CLIENT(id_client)
);
DROP TABLE T_CF_MODAL_DRIVER;
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
DROP TABLE T_CF_MODAL;
CREATE TABLE T_CF_MODAL (
id_modal INTEGER PRIMARY KEY,
transit_board VARCHAR(45),
created_at TIMESTAMP,
updated_at TIMESTAMP,
deleted_at TIMESTAMP
);
DROP TABLE T_CF_MODAL_CATEGORY;
CREATE TABLE T_CF_MODAL_CATEGORY (
id_modal_category INTEGER PRIMARY KEY,
name VARCHAR(45),
created_at TIMESTAMP,
updated_at TIMESTAMP,
deleted_at TIMESTAMP
);
DROP TABLE T_CF_SUBSCRIPTION_PLAN;
CREATE TABLE T_CF_SUBSCRIPTION_PLAN (
id_subscription_plan INTEGER PRIMARY KEY,
name VARCHAR(45),
price FLOAT,
created_at TIMESTAMP,
updated_at TIMESTAMP,
deleted_at TIMESTAMP
);
    





