DROP TABLE if EXISTS account;
CREATE TABLE account (
    quantitydollars   NUMBER NOT NULL,
    quantitybitcoins  NUMBER NOT NULL,
    blockeddollars    NUMBER,
    freedollars       NUMBER,
    comissiondollars  NUMBER,
    platformuser_id   VARCHAR2(30) NOT NULL
);

ALTER TABLE account ADD CONSTRAINT account_pk PRIMARY KEY ( platformuser_id );

DROP TABLE if EXISTS auction;
CREATE TABLE auction (
    id               VARCHAR2(30) NOT NULL,
    quantity         NUMBER NOT NULL,
    price            NUMBER NOT NULL,
    initialdate      TIMESTAMP NOT NULL,
    finaldate        TIMESTAMP NOT NULL,
    isactive         NUMBER NOT NULL,
    platformuser_id  VARCHAR2(30) NOT NULL
);

ALTER TABLE auction ADD CONSTRAINT auction_pk PRIMARY KEY ( id,
                                                            platformuser_id );
DROP TABLE if EXISTS bid;
CREATE TABLE bid (
    id               VARCHAR2(30) NOT NULL,
    quantity         NUMBER NOT NULL,
    price            NUMBER NOT NULL,
    date_creation    TIMESTAMP NOT NULL,
    iswinner         NUMBER NOT NULL,
    auction_id       VARCHAR2(30) NOT NULL,
    auction_platformuser_id      VARCHAR2(30) NOT NULL,
    platformuser_id  VARCHAR2(30) NOT NULL
);

ALTER TABLE bid
    ADD CONSTRAINT bid_pk PRIMARY KEY ( id,
                                        auction_id,
                                        auction_platformuser_id,
                                        platformuser_id );

DROP TABLE if EXISTS movement;
CREATE TABLE movement (
    id              VARCHAR2(30) NOT NULL,
    date_creation   TIMESTAMP NOT NULL,
    price           NUMBER NOT NULL,
    quantity        NUMBER NOT NULL,
    account_id      VARCHAR2(30) NOT NULL
);

ALTER TABLE movement ADD CONSTRAINT movement_pk PRIMARY KEY ( account_id );

DROP TABLE if EXISTS platformuser;
CREATE TABLE platformuser (
    id        VARCHAR2(30) NOT NULL,
    password  VARCHAR2(30) NOT NULL,
    broker    NUMBER,
    admin     NUMBER,
    bidder    NUMBER
);

ALTER TABLE platformuser ADD CONSTRAINT platformuser_pk PRIMARY KEY ( id );

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
/