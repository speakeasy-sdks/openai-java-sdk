# CreateEditResponse

OK


## Fields

| Field                                                                               | Type                                                                                | Required                                                                            | Description                                                                         |
| ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------- |
| `choices`                                                                           | List<[CreateEditResponseChoices](../../models/shared/CreateEditResponseChoices.md)> | :heavy_check_mark:                                                                  | A list of edit choices. Can be more than one if `n` is greater than 1.              |
| `created`                                                                           | *Long*                                                                              | :heavy_check_mark:                                                                  | A unix timestamp of when the edit was created.                                      |
| `object`                                                                            | *String*                                                                            | :heavy_check_mark:                                                                  | The object type, which is always `edit`.                                            |
| `usage`                                                                             | [CompletionUsage](../../models/shared/CompletionUsage.md)                           | :heavy_check_mark:                                                                  | Usage statistics for the completion request.                                        |