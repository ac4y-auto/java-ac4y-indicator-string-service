# java-ac4y-indicator-string-service

String-based service adapter for indicator operations accepting/returning JSON strings.

## Coordinates

- **GroupId**: `ac4y`
- **ArtifactId**: `ac4y-indicator-string-service`
- **Version**: `1.0.0`

## Description

String-based service adapter that wraps the indicator ObjectService, accepting JSON string requests and returning JSON string responses. Provides a simplified interface for external integration without requiring typed DTOs.

### Key Classes

- `Ac4yIndicatorStringService` - String-based service adapter

## Dependencies

- `ac4y-indicator-object-service` (typed service layer)
- `ac4y-indicator` (core domain)
- Log4j 2

## Build

```bash
mvn clean package
```

## Origin

Extracted from `IJIndicatorModule/Ac4yIndicatorStringService`.
