# Architektura - java-ac4y-indicator-string-service

## Attekintes

String-alapu szolgaltatas adapter az indikator muveletekhez, JSON string kereseket/valaszokat fogad/ad vissza.

## Szerkezet

```
src/main/java/ac4y/indicator/service/string/
  Ac4yIndicatorStringService.java               - String-alapu szolgaltatas adapter
```

## Mukodes

Az `Ac4yIndicatorStringService` az `Ac4yIndicatorObjectService`-t burkolja, JSON string kereseket fogad es JSON string valaszokat ad vissza. Egyszerusitett interfeszt biztosit kulso integraciohoz tipusos DTO-k nelkul.

## Fuggosegek

- ac4y-indicator-object-service (tipusos szolgaltatas reteg)
- ac4y-indicator (domain)
- Log4j 2

## Eredet

Az `IJIndicatorModule/Ac4yIndicatorStringService` modulbol kinyerve.
