CREATE TABLE IF NOT EXISTS public.voucherdetails
(
    id bigserial NOT NULL ,
    name character varying(100) ,
    address character varying(100) ,
    phone character varying(10) ,
    headid integer,
    amount double precision
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.voucherdetails
    OWNER to postgres;