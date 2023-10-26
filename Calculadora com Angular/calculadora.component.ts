import { Component } from '@angular/core';

@Component({
  selector: 'app-calculadora',
  templateUrl: './calculadora.component.html',
  styleUrls: ['./calculadora.component.scss']
})
export class CalculadoraComponent {

  operacaoAnterior: any = '';
  operacaoAtual: any = '';
  primeiraOperacao = true;

  adicionarAoVisor(value:any){
    if(this.primeiraOperacao){
      if(+value >= 0 || value === ",") {
        this.adicionarDigito(value)
      } else {
        this.processarOperacao(value)
      }
    } else {
      this.operacaoAnterior = "";
      this.operacaoAtual = "";
      this.primeiraOperacao = true;
      if(+value >= 0 || value === ",") {
        this.adicionarDigito(value)
      } else {
        this.processarOperacao(value)
      }
    }
  }

  adicionarDigito(digito:any) {
    if(digito === "," && this.operacaoAtual.includes(",")) {
      return
    }
    this.operacaoAtual += digito;
    this.atualizarVisor(null, null, null, null)
  }

  processarOperacao(operacao: any) {
    if(this.operacaoAtual === "" && operacao !== "C") {

      if(this.operacaoAnterior !== "") {
        this.alterarOperacao(operacao)
      }
      return
    }

    let valorOperacao: any;
    let anterior = +this.operacaoAnterior.split(" ") [0];
    let atual = +this.operacaoAtual;

    switch(operacao) {
      case"+":
      valorOperacao = anterior + atual;
      this.atualizarVisor(valorOperacao, operacao, atual, anterior);
      break

      case"-":
      valorOperacao = anterior - atual;
      this.atualizarVisor(valorOperacao, operacao, atual, anterior);
      break

      case"*":
      valorOperacao = anterior * atual;
      this.atualizarVisor(valorOperacao, operacao, atual, anterior);
      break

      case"/":
      valorOperacao = anterior / atual;
      this.atualizarVisor(valorOperacao, operacao, atual, anterior);
      break

      case"DEL":
      this.deletarNumero()
      break

      case"C":
      this.apagarTudo()
      break

      case"=":
      this.resultado()
      break
    }
  }

  alterarOperacao(operacao: any) {

    const operacoesMat = [ "+", "-", "*", "/"]
    if(!operacao.includes(operacao)) {
      return
    }
    this.operacaoAnterior = this.operacaoAnterior.trim().slice(0, -1) + operacao;

  }

  atualizarVisor(
    valorOperacao = null,
    operacao = null,
    atual: any,
    anterior: any
  ) {

if(valorOperacao !== null) {
  if(anterior === 0) {
    valorOperacao = atual;
  }
  this.operacaoAnterior = `${atual} ${operacao}`
  if(anterior > 0) {
    this.operacaoAnterior = `${anterior} ${operacao} ${atual} = `
    this.operacaoAtual = valorOperacao;
  } else {
    this.operacaoAtual = "";
  }
}

  }

  deletarNumero() {
    this.operacaoAtual = this.operacaoAtual.slice(0, -1);
  }
  apagarTudo() {
    this.operacaoAtual = "";
    
  }
  resultado() {
    let operacao = this.operacaoAnterior.split(" ")[1];
    this.primeiraOperacao = false;
    this.processarOperacao(operacao);
    
  }

}
