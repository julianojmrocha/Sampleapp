# language: pt

@sampleApp

Funcionalidade: Envio de e-mail

Cenário: Validar envio de e-mail com sucesso

  Dado que o usuário acesse o sistema do samplapp
  Quando preencher o formulário da aba Enter Vehicle Data
  E clicar na opção Next Enter Vehicle Data
  E preencher o formulário da aba Enter Insurant Data
  E clicar na opção Next na aba Enter Insurant Data
  E preencher o formulário da aba Enter Product Data
  E clicar na opção Next na aba Enter Product Data
  E selecionar o plano desejado na aba Select Price Option
  E clicar na opção Next na aba Select Price Option
  E preencher o formulário da aba Send Quote
  E clicar na opção Send na aba Send Quote
  Entao o sistema exibe mensagem informando Sending e-mail success!