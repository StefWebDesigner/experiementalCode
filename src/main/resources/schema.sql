CREATE TABLE T_USER_SECURE (
    MEMBER_ID PRIMARY KEY,
    SSN NUMERIC NOT NULL,
    DOB DATE NOT NULL,
    USER_ID INTEGER NOT NULL,
    PASSWORD TEXT NOT NULL,
    TWO_FA_EXPIRY_TIME TIME NOT NULL,
    USER_LOCK_FLG TEXT NOT NULL,
    USER_LOCK_TIMESTAMP TIME,
    PASSWORD TEXT NOT NULL,
    TWO_FA_EXPIRY_TIME TIME NOT NULL,
    USER_LOCK_FLG TEXT NOT NULL,
    USER_LOCK_TIMESTAMP TIME,
    LAST_MOD_USER DATE,
    LAST_MOD_TIME_DT DATE
);