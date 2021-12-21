-- ------------------------------------------------------------------------------
-- - Reconstruction de la base de données                                     ---
-- ------------------------------------------------------------------------------

DROP DATABASE IF EXISTS product_management;
CREATE DATABASE product_management;
USE product_management;

-- -----------------------------------------------------------------------------
-- - Construction de la table des fournisseurs                                  ---
-- -----------------------------------------------------------------------------

CREATE TABLE T_supplier (
    `id`           INT          		NOT NULL AUTO_INCREMENT,
    `name`         VARCHAR(20)        NOT NULL,
    `city`			  VARCHAR(20)		   NOT NULL,
    PRIMARY KEY (`id`) USING BTREE
);

-- -----------------------------------------------------------------------------
-- - Construction de la table des produits                                  ---
-- -----------------------------------------------------------------------------

CREATE TABLE T_products (
    id            int          		NOT NULL AUTO_INCREMENT,
    label         VARCHAR(20)       NOT NULL,
    price			DOUBLE 	       	NOT NULL,
    id_supplier   INT          	,
    PRIMARY KEY (`id`) USING BTREE,
    FOREIGN KEY (id_supplier) REFERENCES T_supplier(id)
);