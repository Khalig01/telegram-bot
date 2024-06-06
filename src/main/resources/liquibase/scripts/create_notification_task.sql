-- liquibase formatted sql

-- changeset khal:1

CREATE TABLE notification_task (
id BIGSERIAL primary key,
chat_id BIGINT,
task_text VARCHAR,
task_date TIMESTAMP
)