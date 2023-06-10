# CreateImageRequest


## Fields

| Field                                                                                       | Type                                                                                        | Required                                                                                    | Description                                                                                 | Example                                                                                     |
| ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| `n`                                                                                         | *Long*                                                                                      | :heavy_minus_sign:                                                                          | The number of images to generate. Must be between 1 and 10.                                 | 1                                                                                           |
| `prompt`                                                                                    | *String*                                                                                    | :heavy_check_mark:                                                                          | A text description of the desired image(s). The maximum length is 1000 characters.          | A cute baby sea otter                                                                       |
| `responseFormat`                                                                            | [CreateImageRequestResponseFormat](../../models/shared/CreateImageRequestResponseFormat.md) | :heavy_minus_sign:                                                                          | The format in which the generated images are returned. Must be one of `url` or `b64_json`.  | url                                                                                         |
| `size`                                                                                      | [CreateImageRequestSize](../../models/shared/CreateImageRequestSize.md)                     | :heavy_minus_sign:                                                                          | The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`.      | 1024x1024                                                                                   |
| `user`                                                                                      | *Object*                                                                                    | :heavy_minus_sign:                                                                          | N/A                                                                                         |                                                                                             |