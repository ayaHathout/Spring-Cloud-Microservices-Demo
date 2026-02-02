--
-- PostgreSQL database dump
--

\restrict YKxRQ6k8g6b8VXVV9bNuHo7WDA4DCRvL8neDceAd5Iccs1WHrREafcnLl9f0FxB

-- Dumped from database version 18.1
-- Dumped by pg_dump version 18.1

-- Started on 2026-02-03 01:31:21

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET transaction_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- TOC entry 220 (class 1259 OID 41066)
-- Name: addresses; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.addresses (
    id integer NOT NULL,
    street character varying(255),
    city character varying(255),
    country character varying(255),
    employee_id integer
);


ALTER TABLE public.addresses OWNER TO postgres;

--
-- TOC entry 219 (class 1259 OID 41065)
-- Name: addresses_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

ALTER TABLE public.addresses ALTER COLUMN id ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.addresses_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);


--
-- TOC entry 4905 (class 0 OID 41066)
-- Dependencies: 220
-- Data for Name: addresses; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.addresses (id, street, city, country, employee_id) FROM stdin;
1	Wasl El Dahshour	6th of October	Egypt	1
2	Ahram	Giza	Egypt	2
\.


--
-- TOC entry 4911 (class 0 OID 0)
-- Dependencies: 219
-- Name: addresses_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.addresses_id_seq', 2, true);


--
-- TOC entry 4756 (class 2606 OID 41071)
-- Name: addresses addresses_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.addresses
    ADD CONSTRAINT addresses_pkey PRIMARY KEY (id);


-- Completed on 2026-02-03 01:31:29

--
-- PostgreSQL database dump complete
--

\unrestrict YKxRQ6k8g6b8VXVV9bNuHo7WDA4DCRvL8neDceAd5Iccs1WHrREafcnLl9f0FxB

