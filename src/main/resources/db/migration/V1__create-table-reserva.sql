CREATE TABLE reserva (
                         id BIGINT AUTO_INCREMENT PRIMARY KEY, -- Chave primária com incremento automático
                         nome_evento VARCHAR(255) NOT NULL,   -- Nome do evento, obrigatório
                         tipo_evento VARCHAR(50) NOT NULL,    -- Tipo do evento (Enum como texto)
                         responsavel VARCHAR(255) NOT NULL,   -- Nome do responsável, obrigatório
                         data_cadastro_reserva TIMESTAMP,     -- Data de cadastro
                         data_ultima_atualizacao_reserva TIMESTAMP, -- Data de última atualização
                         periodo_reserva DATE,                -- Data do período da reserva
                         turno VARCHAR(20) NOT NULL,          -- Turno (Enum como texto)
                         horario_inicio TIME NOT NULL,        -- Horário de início
                         horario_termino TIME NOT NULL,       -- Horário de término
                         total_participantes INT NOT NULL CHECK (total_participantes >= 1), -- Total de participantes com validação
                         situacao VARCHAR(20) NOT NULL        -- Situação da reserva (Enum como texto)
);