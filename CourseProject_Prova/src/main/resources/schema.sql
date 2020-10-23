-- Generado por Oracle SQL Developer Data Modeler 19.4.0.350.1424
--   en:        2020-10-23 17:11:43 CEST
--   sitio:      Oracle Database 11g
--   tipo:      Oracle Database 11g



DROP TABLE account CASCADE CONSTRAINTS;

DROP TABLE auction CASCADE CONSTRAINTS;

DROP TABLE bid CASCADE CONSTRAINTS;

DROP TABLE movement CASCADE CONSTRAINTS;

DROP TABLE platformuser CASCADE CONSTRAINTS;

DROP TABLE purchase CASCADE CONSTRAINTS;

CREATE TABLE account (
    quantitydollars   NUMBER NOT NULL,
    quantitybitcoins  NUMBER NOT NULL,
    blockeddollars    NUMBER,
    freedollars       NUMBER,
    comissiondollars  NUMBER,
    platformuser_id   VARCHAR2(30) NOT NULL
);

ALTER TABLE account ADD CONSTRAINT account_pk PRIMARY KEY ( platformuser_id );

CREATE TABLE auction (
    id               VARCHAR2(30) NOT NULL,
    quantity         NUMBER NOT NULL,
    price            NUMBER NOT NULL,
    initialdate      TIMESTAMP NOT NULL,
    finaldate        TIMESTAMP NOT NULL,
    isactive         TINYINT NOT NULL,
    platformuser_id  VARCHAR2(30) NOT NULL
);

ALTER TABLE auction ADD CONSTRAINT auction_pk PRIMARY KEY ( id,
                                                            platformuser_id );

CREATE TABLE bid (
    id               VARCHAR2(30) NOT NULL,
    quantity         NUMBER NOT NULL,
    price            NUMBER NOT NULL,
    date_creation    TIMESTAMP NOT NULL,
    iswinner         TINYINT NOT NULL,
    auction_id       VARCHAR2(30) NOT NULL,
    auction_platformuser_id      VARCHAR2(30) NOT NULL,
    platformuser_id  VARCHAR2(30) NOT NULL
);

ALTER TABLE bid
    ADD CONSTRAINT bid_pk PRIMARY KEY ( id,
                                        auction_id,
                                        auction_platformuser_id,
                                        platformuser_id );

CREATE TABLE movement (
    quantity    NUMBER NOT NULL,
    account_id  VARCHAR2(30) NOT NULL
);

ALTER TABLE movement ADD CONSTRAINT movement_pk PRIMARY KEY ( account_id );

CREATE TABLE platformuser (
    id        VARCHAR2(30) NOT NULL,
    password  VARCHAR2(30) NOT NULL,
    broker    TINYINT,
    admin     TINYINT,
    bidder    TINYINT
);

ALTER TABLE platformuser ADD CONSTRAINT platformuser_pk PRIMARY KEY ( id );

CREATE TABLE purchase (
    id               VARCHAR2(30) NOT NULL,
    quantity         NUMBER NOT NULL,
    price            NUMBER NOT NULL,
    date_creation    TIMESTAMP NOT NULL,
    platformuser_id  VARCHAR2(30) NOT NULL
);

ALTER TABLE purchase ADD CONSTRAINT purchase_pk PRIMARY KEY ( id,
                                                              platformuser_id );

ALTER TABLE account
    ADD CONSTRAINT account_platformuser_fk FOREIGN KEY ( platformuser_id )
        REFERENCES platformuser ( id );

ALTER TABLE auction
    ADD CONSTRAINT auction_platformuser_fk FOREIGN KEY ( platformuser_id )
        REFERENCES platformuser ( id );

ALTER TABLE bid
    ADD CONSTRAINT bid_auction_fk FOREIGN KEY ( auction_id,
                                                auction_platformuser_id )
        REFERENCES auction ( id,
                             platformuser_id );

ALTER TABLE bid
    ADD CONSTRAINT bid_platformuser_fk FOREIGN KEY ( platformuser_id )
        REFERENCES platformuser ( id );

ALTER TABLE movement
    ADD CONSTRAINT movement_account_fk FOREIGN KEY ( account_id )
        REFERENCES account ( platformuser_id );

ALTER TABLE purchase
    ADD CONSTRAINT purchase_platformuser_fk FOREIGN KEY ( platformuser_id )
        REFERENCES platformuser ( id );

CREATE OR REPLACE TRIGGER fkntm_account BEFORE
    UPDATE OF platformuser_id ON account
BEGIN
    raise_application_error(-20225, 'Non Transferable FK constraint  on table Account is violated');
END;
/



-- Informe de Resumen de Oracle SQL Developer Data Modeler:
--
-- CREATE TABLE                             6
-- CREATE INDEX                             0
-- ALTER TABLE                             12
-- CREATE VIEW                              0
-- ALTER VIEW                               0
-- CREATE PACKAGE                           0
-- CREATE PACKAGE BODY                      0
-- CREATE PROCEDURE                         0
-- CREATE FUNCTION                          0
-- CREATE TRIGGER                           1
-- ALTER TRIGGER                            0
-- CREATE COLLECTION TYPE                   0
-- CREATE STRUCTURED TYPE                   0
-- CREATE STRUCTURED TYPE BODY              0
-- CREATE CLUSTER                           0
-- CREATE CONTEXT                           0
-- CREATE DATABASE                          0
-- CREATE DIMENSION                         0
-- CREATE DIRECTORY                         0
-- CREATE DISK GROUP                        0
-- CREATE ROLE                              0
-- CREATE ROLLBACK SEGMENT                  0
-- CREATE SEQUENCE                          0
-- CREATE MATERIALIZED VIEW                 0
-- CREATE MATERIALIZED VIEW LOG             0
-- CREATE SYNONYM                           0
-- CREATE TABLESPACE                        0
-- CREATE USER                              0
--
-- DROP TABLESPACE                          0
-- DROP DATABASE                            0
--
-- REDACTION POLICY                         0
--
-- ORDS DROP SCHEMA                         0
-- ORDS ENABLE SCHEMA                       0
-- ORDS ENABLE OBJECT                       0
--
-- ERRORS                                   0
-- WARNINGS                                 0
