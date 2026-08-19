package br.consultoriait.crm.model;

public enum Status {
    PROSPECÇÃO(Status.QUALIFICAÇÃO),
    QUALIFICAÇÃO(Status.PROPOSTA_TÉCNICA),
    PROPOSTA_TÉCNICA(Status.NEGOCIAÇÃO),
    NEGOCIAÇÃO(Status.IMPLEMENTAÇÃO),
    IMPLEMENTAÇÃO(Status.FECHADO, Status.PERDIDO),
    FECHADO(),  // Terminal, não vai pra lugar nenhum
    PERDIDO();  // Terminal

    private Status[] proximosStatus;

    Status(Status... proximos) {
        this.proximosStatus = proximos;
    }

    public boolean podeMudarPara(Status novo) {
        for (Status proximo : proximosStatus) {
            if (proximo == novo) {
                return true;
            }
        }
        return false;
    }
}