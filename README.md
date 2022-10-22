# Verify Ceft Using Crystals-Dilithium

API

| URL | Method |
| --- | ----------- |
| /certificate | GET |
| /certificate | POST |
| /certificate/{id}	| PUT | 
| /certificate/{id} |	DELETE | 
| /certificate/sign/{id} | GET | 
| /certificate/message/{id}	| GET | 
| /certificate/verify/{id} | GET | 
| /dilithium	| GET | 
| /dilithium/publickey	| GET | 

SQL Script

```
CREATE TABLE Certificate (
        certificateID int(10) not null auto_increment PRIMARY key,
        type nvarchar(100),
        name nvarchar(100),
        gender nvarchar(100),
        birthday nvarchar(100),
        spec nvarchar(100),
        grade nvarchar(100),
        completeday nvarchar(100),
        signature BLOB
);
```
