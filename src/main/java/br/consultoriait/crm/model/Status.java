package br.consultoriait.crm.model;

public enum Status {
    PROSPECCAO,
    QUALIFICACAO,
    PROPOSTA_TECNICA,
    NEGOCIACAO,
    IMPLEMENTACAO,
    FECHADO,
    PERDIDO;



    public boolean podeMudarPara(Status novo) {
        return switch (this) {
            case PROSPECCAO -> novo == QUALIFICACAO || novo == PERDIDO;
            case QUALIFICACAO -> novo == PROPOSTA_TECNICA || novo == PERDIDO;
            case PROPOSTA_TECNICA-> novo == NEGOCIACAO || novo == PERDIDO;
            case NEGOCIACAO-> novo == IMPLEMENTACAO || novo == PERDIDO;
            case IMPLEMENTACAO-> novo == FECHADO || novo == PERDIDO;
            case FECHADO, PERDIDO -> false;
        };
    }

    public boolean isFinal() {
        return this == FECHADO || this == PERDIDO;
    }
}