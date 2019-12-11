# Versionamento de API

O versionamento de API embora muitas vezes negligênciado, deve ser uma preocupação desde o 
inicio do projeto de uma API REST. Para esta finalidade existem várias maneira de alcançar o mesmo
objetivo, são elas: versionamento na URI, no parâmetro da URL, por headers customizados e negociação
de conteúdo. Como o objetivo aqui é expor mais afundo o versionamento por negociação de conteúdo, as 
outras meneiras de versionamento não serão abordados neste artigo.

# HTTP Content-Type
Os Content-Type são geralmente usados com os valores *text/html*, *application/json*, 
*application/xml* dentre outros, porém a RFC 6838 do protocolo HTTP possibilita a criação de
MIME types customizados para vendor, exemplo, *type/vnd.nome do produtor+sufixo*. 

Minor MAJOR
Latest

#Referências
https://dzone.com/articles/best-practice-api-versioning-for-http-rest-interfa
https://tools.ietf.org/html/rfc6838#section-3.2

