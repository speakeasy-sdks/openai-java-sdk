# Model

Describes an OpenAI model offering that can be used with the API.


## Fields

| Field                                                               | Type                                                                | Required                                                            | Description                                                         |
| ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- | ------------------------------------------------------------------- |
| `created`                                                           | *Long*                                                              | :heavy_check_mark:                                                  | The date and time when the model was created.                       |
| `id`                                                                | *String*                                                            | :heavy_check_mark:                                                  | The model identifier, which can be referenced in the API endpoints. |
| `object`                                                            | *String*                                                            | :heavy_check_mark:                                                  | The object type, which is always "model".                           |
| `ownedBy`                                                           | *String*                                                            | :heavy_check_mark:                                                  | The organization that owns the model.                               |