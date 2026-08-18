package br.consultoriait.crm.model;

import java.time.LocalDate;


public abstract class  Oportunidade{
        protected int id;
        protected LocalDate dataCriacao;
        protected double valor;
        protected Status status;
        protected long itens_id;
        protected int vendedor_id;
        protected int cliente_id;



        public Oportunidade (int id, LocalDate dataCriacao, double valor, Status status, long itens_id, int vendedor_id, int cliente_id){
            this.id=id;
            this.dataCriacao=dataCriacao;
            this.valor=valor;
            this.status = Status.PROSPECÇÃO;
            this.itens_id=itens_id;
            this.vendedor_id=vendedor_id;
            this.cliente_id=cliente_id;

        }

        public void mudarStatus (Status novo) {
            if (!this.status.podeMudarPara(novo)) {
                throw new IllegalArgumentException(
                        "Transição inválida: " + this.status + " → " + novo
                );
            }
            this.status = novo;
        }



        public abstract double calcularCusto();

        public double obterCusto(){
            return calcularCusto();
        }

}