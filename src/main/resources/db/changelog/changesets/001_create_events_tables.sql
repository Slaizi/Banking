create table events
(
    id bigint primary key,
    aggregate_id varchar(36),
    dtype varchar(255) not null,
    "timestamp" timestamp not null default current_timestamp,
    payload jsonb
);