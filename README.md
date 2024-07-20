# ModelagemIphone

## Diagrama de Classes.

``` mermaid
classDiagram
    class iPhone {
        +playMusic()
        +makeCall()
        +browseInternet()
    }

    class MusicPlayer {
        <<interface>>
        +play()
        +pause()
        +stop()
        +nextTrack()
        +previousTrack()
    }

    class Telephone {
        <<interface>>
        +makeCall(number: String)
        +endCall()
        +answerCall()
        +holdCall()
    }

    class InternetBrowser {
        <<interface>>
        +openURL(url: String)
        +refresh()
        +goBack()
        +goForward()
        +bookmarkPage()
    }

    iPhone ..|> MusicPlayer
    iPhone ..|> Telephone
    iPhone ..|> InternetBrowser

```
##**Descrição das Classes e Interfaces**.

**iPhone**: Classe principal que implementa as funcionalidades de Reprodutor Musical, Aparelho Telefônico e Navegador na Internet.  
**MusicPlayer**: Interface que define os métodos para reprodução de música (`play`, `pause`, `stop`, `nextTrack`, `previousTrack`).  
**Telephone**: Interface que define os métodos para funcionalidades de telefone (`makeCall`, `endCall`, `answerCall`, `holdCall`).  
**InternetBrowser**: Interface que define os métodos para navegação na internet (`openURL`, `refresh`, `goBack`, `goForward`, `bookmarkPage`).  
Neste diagrama, a classe **iPhone** implementa três interfaces (**MusicPlayer**, **Telephone** e **InternetBrowser**), representando os diferentes papéis que o iPhone pode desempenhar.
