# Getting started

Send SMS with Onfon Media SMS Platform.

## How to Build

The generated code uses a few Gradle dependencies e.g., Jackson, Volley,
and Apache HttpClient. The reference to these dependencies is already
added in the build.gradle file will be installed automatically. Therefore,
you will need internet access for a successful build.

* In order to open the client library in Android Studio click on ``` Open an Existing Android Project ```.

![Importing SDK into Android Studio - Step 1](https://apidocs.io/illustration/android?step=import1&workspaceFolder=OnfonMedia%20SMS%20Gateway&workspaceName=OnfonMediaSMSGateway&projectName=OnfonMediaSMSGatewayLib&rootNamespace=ke.co.onfonmedia.api)

* Browse to locate the folder containing the source code. Select the location of the OnfonMediaSMSGateway gradle project and click ``` Ok ```.

![Importing SDK into Android Studio - Step 2](https://apidocs.io/illustration/android?step=import2&workspaceFolder=OnfonMedia%20SMS%20Gateway&workspaceName=OnfonMediaSMSGateway&projectName=OnfonMediaSMSGatewayLib&rootNamespace=ke.co.onfonmedia.api)

* Upon successful import, the project can be built by clicking on ``` Build > Make Project ``` or  pressing ``` Ctrl + F9 ```.

![Importing SDK into Android Studio - Step 3](https://apidocs.io/illustration/android?step=import3&workspaceFolder=OnfonMedia%20SMS%20Gateway&workspaceName=OnfonMediaSMSGateway&projectName=OnfonMediaSMSGatewayLib&rootNamespace=ke.co.onfonmedia.api)

## How to Use

The following section explains how to use the OnfonMediaSMSGateway library in a new project.

### 1. Starting a new project 

For starting a new project, click on ``` Create New Android Studio Project ```.

![Add a new project in Android Studio - Step 1](https://apidocs.io/illustration/android?step=createNewProject0&workspaceFolder=OnfonMedia%20SMS%20Gateway&workspaceName=OnfonMediaSMSGateway&projectName=OnfonMediaSMSGatewayLib&rootNamespace=ke.co.onfonmedia.api)

Here, configure the new project by adding the name, domain and location of the sample application followed by clicking ``` Next ```.

![Create a new Android Studio Project - Step 2](https://apidocs.io/illustration/android?step=createNewProject1&workspaceFolder=OnfonMedia%20SMS%20Gateway&workspaceName=OnfonMediaSMSGateway&projectName=OnfonMediaSMSGatewayLib&rootNamespace=ke.co.onfonmedia.api)

Following this, select the `Phone and Tablet` option as shown in the illustration below and click `Next`.

![Create a new Android Studio Project - Step 3](https://apidocs.io/illustration/android?step=createNewProject2&workspaceFolder=OnfonMedia%20SMS%20Gateway&workspaceName=OnfonMediaSMSGateway&projectName=OnfonMediaSMSGatewayLib&rootNamespace=ke.co.onfonmedia.api)

In the following step, choose ``` Empty Activity ``` as the activity type and click ``` Next ```.

![Create a new Android Studio Project - Step 4](https://apidocs.io/illustration/android?step=createNewProject3&workspaceFolder=OnfonMedia%20SMS%20Gateway&workspaceName=OnfonMediaSMSGateway&projectName=OnfonMediaSMSGatewayLib&rootNamespace=ke.co.onfonmedia.api)

In this step, provide an ``` Activity Name ``` and ``` Layout Name ``` and click ``` Finish ```.  This would take you to the newly created project.

![Create a new Android Studio Project - Step 4](https://apidocs.io/illustration/android?step=createNewProject4&workspaceFolder=OnfonMedia%20SMS%20Gateway&workspaceName=OnfonMediaSMSGateway&projectName=OnfonMediaSMSGatewayLib&rootNamespace=ke.co.onfonmedia.api)

### 2. Add reference of the library project

In order to add a dependency to this sample application, click on the android button shown in the project explorer on the left side as shown in the picture. Click on ``` Project ``` in the drop down that emerges.  

![Adding dependency to the client library - Step 1](https://apidocs.io/illustration/android?step=testProject0&workspaceFolder=OnfonMedia%20SMS%20Gateway&workspaceName=OnfonMediaSMSGateway&projectName=OnfonMediaSMSGatewayLib&rootNamespace=ke.co.onfonmedia.api)

Right click the sample application in the project explorer and click on ``` New > Module ```  as shown in the picture.

![Adding dependency to the client library - Step 2](https://apidocs.io/illustration/android?step=testProject1&workspaceFolder=OnfonMedia%20SMS%20Gateway&workspaceName=OnfonMediaSMSGateway&projectName=OnfonMediaSMSGatewayLib&rootNamespace=ke.co.onfonmedia.api)

Choose ``` Import Gradle Project ``` and click ``` Next ```.

![Adding dependency to the client library - Step 3](https://apidocs.io/illustration/android?step=testProject2&workspaceFolder=OnfonMedia%20SMS%20Gateway&workspaceName=OnfonMediaSMSGateway&projectName=OnfonMediaSMSGatewayLib&rootNamespace=ke.co.onfonmedia.api)

Click on ``` Finish ``` which would take you back to the sample application with the refernced SDK. 

![Adding dependency to the client library - Step 4](https://apidocs.io/illustration/android?step=testProject3&workspaceFolder=OnfonMedia%20SMS%20Gateway&workspaceName=OnfonMediaSMSGateway&projectName=OnfonMediaSMSGatewayLib&rootNamespace=ke.co.onfonmedia.api)

In the following step first navigate to the ``` SampleApplication > settings.gradle ``` file and add the line
```include ':OnfonMediaSMSGatewayLib'```

Then navigate to the ``` SampleApplication >  app > build.gradle ``` file and add the following line 
```implementation project(path: ':OnfonMediaSMSGatewayLib')```
to the dependencies section as shown in the illustration below. Also add the following packagingOptions.

packagingOptions
    exclude 'META-INF/LICENSE'
    exclude 'META-INF/NOTICE'
    exclude 'META-INF/DEPENDENCIES'
}

![Adding dependency to the client library - Step 5](https://apidocs.io/illustration/android?step=testProject4&workspaceFolder=OnfonMedia%20SMS%20Gateway&workspaceName=OnfonMediaSMSGateway&projectName=OnfonMediaSMSGatewayLib&rootNamespace=ke.co.onfonmedia.api)

Finally, press ``` Sync Now ``` in the warning visible as shown in the picture below.

![Adding dependency to the client library - Step 6](https://apidocs.io/illustration/android?step=testProject5&workspaceFolder=OnfonMedia%20SMS%20Gateway&workspaceName=OnfonMediaSMSGateway&projectName=OnfonMediaSMSGatewayLib&rootNamespace=ke.co.onfonmedia.api)

### 3. Write sample code

Once the ``` SampleApplication ``` is created, a file named ``` SampleApplication > app > src > main > java > MainActivity ``` will be visible in the *Project Explorer* with an ``` onCreate ``` method. This is the entry point for the execution of the created project.
Here, you can add code to initialize the client library and instantiate a *Controller* class. Sample code to initialize the client library and using controller methods is given in the subsequent sections.

## How to Test

The generated code and the server can be tested using automatically generated test cases. 
JUnit is used as the testing framework and test runner.

In Android Studio, for running the tests do the following:

1. Right click on *SampleApplication > OnfonMediaSMSGatewayLib > androidTest > java)* from the project explorer.
2. Select "Run All Tests" or use "Ctrl + Shift + F10" to run the Tests.

## Initialization

### Authentication
In order to setup authentication and initialization of the API client, you need the following information.

| Parameter | Description |
|-----------|-------------|
| accessKey | Network Layer Access Key |
| apiKey | Used for authentication purpose and pass this parameter in URL encoded format. |
| clientId | Used for authentication purpose and pass this parameter in URL encoded format. |



API client can be initialized as following. The `appContext` being passed is the Android application [`Context`](https://developer.android.com/reference/android/content/Context.html).

```java
// Configuration parameters and credentials
String accessKey = "ACCESS_KEY"; // Network Layer Access Key
String apiKey = "API_KEY"; // Used for authentication purpose and pass this parameter in URL encoded format.
String clientId = "CLIENT_ID"; // Used for authentication purpose and pass this parameter in URL encoded format.

ke.co.onfonmedia.api.Configuration.initialize(appContext);
OnfonMediaSMSGatewayClient client = new OnfonMediaSMSGatewayClient(accessKey, apiKey, clientId);
```


# Class Reference

## <a name="list_of_controllers"></a>List of Controllers

* [AccountController](#account_controller)
* [TemplateController](#template_controller)
* [SMSController](#sms_controller)
* [GROUPController](#group_controller)
* [CampaignController](#campaign_controller)

## <a name="account_controller"></a>![Class: ](https://apidocs.io/img/class.png "ke.co.onfonmedia.api.controllers.AccountController") AccountController

### Get singleton instance

The singleton instance of the ``` AccountController ``` class can be accessed from the API Client.

```java
AccountController account = client.getAccount();
```

### <a name="get_credit_balance_async"></a>![Method: ](https://apidocs.io/img/method.png "ke.co.onfonmedia.api.controllers.AccountController.getCreditBalanceAsync") getCreditBalanceAsync

> Get Credit Balance


```java
void getCreditBalanceAsync(final APICallBack<DynamicResponse> callBack)
```

#### Example Usage

```java
// Invoking the API call with sample inputs
account.getCreditBalanceAsync(new APICallBack<DynamicResponse>() {
    public void onSuccess(HttpContext context, DynamicResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="template_controller"></a>![Class: ](https://apidocs.io/img/class.png "ke.co.onfonmedia.api.controllers.TemplateController") TemplateController

### Get singleton instance

The singleton instance of the ``` TemplateController ``` class can be accessed from the API Client.

```java
TemplateController template = client.getTemplate();
```

### <a name="get_template_list_async"></a>![Method: ](https://apidocs.io/img/method.png "ke.co.onfonmedia.api.controllers.TemplateController.getTemplateListAsync") getTemplateListAsync

> Get Template List


```java
void getTemplateListAsync(final APICallBack<DynamicResponse> callBack)
```

#### Example Usage

```java
// Invoking the API call with sample inputs
template.getTemplateListAsync(new APICallBack<DynamicResponse>() {
    public void onSuccess(HttpContext context, DynamicResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_new_template_async"></a>![Method: ](https://apidocs.io/img/method.png "ke.co.onfonmedia.api.controllers.TemplateController.createNewTemplateAsync") createNewTemplateAsync

> Create New Template


```java
void createNewTemplateAsync(
        final String messageTemplate,
        final String templateName,
        final APICallBack<DynamicResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| messageTemplate |  ``` Required ```  | Template text. |
| templateName |  ``` Required ```  | Name of template |


#### Example Usage

```java
String messageTemplate = "MessageTemplate";
String templateName = "TemplateName";
// Invoking the API call with sample inputs
template.createNewTemplateAsync(messageTemplate, templateName, new APICallBack<DynamicResponse>() {
    public void onSuccess(HttpContext context, DynamicResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="update_template_async"></a>![Method: ](https://apidocs.io/img/method.png "ke.co.onfonmedia.api.controllers.TemplateController.updateTemplateAsync") updateTemplateAsync

> Update Template


```java
void updateTemplateAsync(
        final String messageTemplate,
        final String templateName,
        final int id,
        final APICallBack<DynamicResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| messageTemplate |  ``` Required ```  | Template text. |
| templateName |  ``` Required ```  | Name of template |
| id |  ``` Required ```  | id of template |


#### Example Usage

```java
String messageTemplate = "MessageTemplate";
String templateName = "TemplateName";
int id = 84;
// Invoking the API call with sample inputs
template.updateTemplateAsync(messageTemplate, templateName, id, new APICallBack<DynamicResponse>() {
    public void onSuccess(HttpContext context, DynamicResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="delete_template_async"></a>![Method: ](https://apidocs.io/img/method.png "ke.co.onfonmedia.api.controllers.TemplateController.deleteTemplateAsync") deleteTemplateAsync

> Delete Template


```java
void deleteTemplateAsync(
        final int id,
        final APICallBack<DynamicResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| id |  ``` Required ```  | id of template |


#### Example Usage

```java
int id = 84;
// Invoking the API call with sample inputs
template.deleteTemplateAsync(id, new APICallBack<DynamicResponse>() {
    public void onSuccess(HttpContext context, DynamicResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="sms_controller"></a>![Class: ](https://apidocs.io/img/class.png "ke.co.onfonmedia.api.controllers.SMSController") SMSController

### Get singleton instance

The singleton instance of the ``` SMSController ``` class can be accessed from the API Client.

```java
SMSController sMS = client.getSMS();
```

### <a name="get_sent_message_list_async"></a>![Method: ](https://apidocs.io/img/method.png "ke.co.onfonmedia.api.controllers.SMSController.getSentMessageListAsync") getSentMessageListAsync

> Get Sent Message List


```java
void getSentMessageListAsync(
        final LocalDate enddate,
        final LocalDate fromdate,
        final int length,
        final int start,
        final APICallBack<DynamicResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| enddate |  ``` Required ```  | Date format must be in yyyy-mm-dd |
| fromdate |  ``` Required ```  | Date format must be in yyyy-mm-dd |
| length |  ``` Required ```  | Ending index value to fetch the campaign detail. |
| start |  ``` Required ```  | Starting index value to fetch the campaign detail. |


#### Example Usage

```java
LocalDate enddate = new Date();
LocalDate fromdate = new Date();
int length = 84;
int start = 84;
// Invoking the API call with sample inputs
sMS.getSentMessageListAsync(enddate, fromdate, length, start, new APICallBack<DynamicResponse>() {
    public void onSuccess(HttpContext context, DynamicResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_sent_message_status_async"></a>![Method: ](https://apidocs.io/img/method.png "ke.co.onfonmedia.api.controllers.SMSController.getSentMessageStatusAsync") getSentMessageStatusAsync

> Get Sent Message Status


```java
void getSentMessageStatusAsync(
        final int messageId,
        final APICallBack<DynamicResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| messageId |  ``` Required ```  | MessageId of message |


#### Example Usage

```java
int messageId = 84;
// Invoking the API call with sample inputs
sMS.getSentMessageStatusAsync(messageId, new APICallBack<DynamicResponse>() {
    public void onSuccess(HttpContext context, DynamicResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_create_sms_async"></a>![Method: ](https://apidocs.io/img/method.png "ke.co.onfonmedia.api.controllers.SMSController.getCreateSMSAsync") getCreateSMSAsync

> Create SMS


```java
void getCreateSMSAsync(
        final String message,
        final String mobileNumber,
        final String senderId,
        final String coRelator,
        final Boolean isFlash,
        final Boolean isUnicode,
        final String linkId,
        final String groupId,
        final String scheduleTime,
        final String serviceId,
        final APICallBack<DynamicResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| message |  ``` Required ```  | text message to send |
| mobileNumber |  ``` Required ```  | Use mobile number as comma sepreated to send message on multiple mobile number e.g. 78461230,78945612 |
| senderId |  ``` Required ```  | Approved Sender Id |
| coRelator |  ``` Optional ```  | Parameter required for using SDP OnDemand Service |
| isFlash |  ``` Optional ```  | Is_Flash is true or false for flash message |
| isUnicode |  ``` Optional ```  | Is_Unicode is true or false for unicode message |
| linkId |  ``` Optional ```  | Parameter required for using SDP OnDemand Service |
| groupId |  ``` Optional ```  | Valid group-id of current user (only for group message otherwise leave empty string) |
| scheduleTime |  ``` Optional ```  | scheduleTime Date in yyyy-MM-dd HH:MM (only for schedule message) |
| serviceId |  ``` Optional ```  | Parameter required for using SDP OnSubscription Service |


#### Example Usage

```java
String message = "Message";
String mobileNumber = "MobileNumber";
String senderId = "SenderId";
String coRelator = "CoRelator";
Boolean isFlash = false;
Boolean isUnicode = false;
String linkId = "LinkId";
String groupId = "groupId";
String scheduleTime = "scheduleTime";
String serviceId = "serviceId";
// Invoking the API call with sample inputs
sMS.getCreateSMSAsync(message, mobileNumber, senderId, coRelator, isFlash, isUnicode, linkId, groupId, scheduleTime, serviceId, new APICallBack<DynamicResponse>() {
    public void onSuccess(HttpContext context, DynamicResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_sms_async"></a>![Method: ](https://apidocs.io/img/method.png "ke.co.onfonmedia.api.controllers.SMSController.createSMSAsync") createSMSAsync

> Create SMS


```java
void createSMSAsync(
        final String message,
        final String mobileNumber,
        final String senderId,
        final String coRelator,
        final Boolean isFlash,
        final Boolean isUnicode,
        final String linkId,
        final String groupId,
        final String scheduleTime,
        final String serviceId,
        final APICallBack<DynamicResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| message |  ``` Required ```  | text message to send |
| mobileNumber |  ``` Required ```  | Use mobile number as comma sepreated to send message on multiple mobile number e.g. 78461230,78945612 |
| senderId |  ``` Required ```  | Approved Sender Id |
| coRelator |  ``` Optional ```  | Parameter required for using SDP OnDemand Service |
| isFlash |  ``` Optional ```  | Is_Flash is true or false for flash message |
| isUnicode |  ``` Optional ```  | Is_Unicode is true or false for unicode message |
| linkId |  ``` Optional ```  | Parameter required for using SDP OnDemand Service |
| groupId |  ``` Optional ```  | Valid group-id of current user (only for group message otherwise leave empty string) |
| scheduleTime |  ``` Optional ```  | scheduleTime Date in yyyy-MM-dd HH:MM (only for schedule message) |
| serviceId |  ``` Optional ```  | Parameter required for using SDP OnSubscription Service |


#### Example Usage

```java
String message = "Message";
String mobileNumber = "MobileNumber";
String senderId = "SenderId";
String coRelator = "CoRelator";
Boolean isFlash = false;
Boolean isUnicode = false;
String linkId = "LinkId";
String groupId = "groupId";
String scheduleTime = "scheduleTime";
String serviceId = "serviceId";
// Invoking the API call with sample inputs
sMS.createSMSAsync(message, mobileNumber, senderId, coRelator, isFlash, isUnicode, linkId, groupId, scheduleTime, serviceId, new APICallBack<DynamicResponse>() {
    public void onSuccess(HttpContext context, DynamicResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_create_bulk_sms_async"></a>![Method: ](https://apidocs.io/img/method.png "ke.co.onfonmedia.api.controllers.SMSController.getCreateBulkSMSAsync") getCreateBulkSMSAsync

> Create Bulk SMS


```java
void getCreateBulkSMSAsync(
        final String mobileNumberMessage,
        final String senderId,
        final String coRelator,
        final Boolean isFlash,
        final Boolean isUnicode,
        final String linkId,
        final LocalDate scheduleTime,
        final String serviceId,
        final APICallBack<DynamicResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| mobileNumberMessage |  ``` Required ```  | Please ensure while submitting the request the message should be passed in encoded format. e.g. 78461230^test~78945612^hello |
| senderId |  ``` Required ```  | Approved Sender Id |
| coRelator |  ``` Optional ```  | Parameter required for using SDP OnDemand Service |
| isFlash |  ``` Optional ```  | Is_Flash is true or false for flash message |
| isUnicode |  ``` Optional ```  | Is_Unicode is true or false for unicode message |
| linkId |  ``` Optional ```  | Parameter required for using SDP OnDemand Service |
| scheduleTime |  ``` Optional ```  | scheduleTime Date in yyyy-MM-dd HH:MM (only for schedule message) |
| serviceId |  ``` Optional ```  | Parameter required for using SDP OnSubscription Service |


#### Example Usage

```java
String mobileNumberMessage = "MobileNumber_Message";
String senderId = "SenderId";
String coRelator = "CoRelator";
Boolean isFlash = false;
Boolean isUnicode = false;
String linkId = "LinkId";
LocalDate scheduleTime = new Date();
String serviceId = "serviceId";
// Invoking the API call with sample inputs
sMS.getCreateBulkSMSAsync(mobileNumberMessage, senderId, coRelator, isFlash, isUnicode, linkId, scheduleTime, serviceId, new APICallBack<DynamicResponse>() {
    public void onSuccess(HttpContext context, DynamicResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_bulk_sms_async"></a>![Method: ](https://apidocs.io/img/method.png "ke.co.onfonmedia.api.controllers.SMSController.createBulkSMSAsync") createBulkSMSAsync

> Create Bulk SMS


```java
void createBulkSMSAsync(
        final List<String> messageParameters,
        final String senderId,
        final Boolean isFlash,
        final Boolean isUnicode,
        final LocalDate scheduleDateTime,
        final APICallBack<DynamicResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| messageParameters |  ``` Required ```  ``` Collection ```  | TODO: Add a parameter description |
| senderId |  ``` Required ```  | Approved Sender Id |
| isFlash |  ``` Optional ```  | Is_Flash is true or false for flash message |
| isUnicode |  ``` Optional ```  | Is_Unicode is true or false for unicode message |
| scheduleDateTime |  ``` Optional ```  | scheduleTime Date in yyyy-MM-dd HH:MM (only for schedule message) |


#### Example Usage

```java
List<String> messageParameters = new LinkedList<String>(Arrays.asList("MessageParameters"));
String senderId = "SenderId";
Boolean isFlash = false;
Boolean isUnicode = false;
LocalDate scheduleDateTime = new Date();
// Invoking the API call with sample inputs
sMS.createBulkSMSAsync(messageParameters, senderId, isFlash, isUnicode, scheduleDateTime, new APICallBack<DynamicResponse>() {
    public void onSuccess(HttpContext context, DynamicResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="group_controller"></a>![Class: ](https://apidocs.io/img/class.png "ke.co.onfonmedia.api.controllers.GROUPController") GROUPController

### Get singleton instance

The singleton instance of the ``` GROUPController ``` class can be accessed from the API Client.

```java
GROUPController gROUP = client.getGROUP();
```

### <a name="get_group_list_async"></a>![Method: ](https://apidocs.io/img/method.png "ke.co.onfonmedia.api.controllers.GROUPController.getGroupListAsync") getGroupListAsync

> Get Group List


```java
void getGroupListAsync(final APICallBack<DynamicResponse> callBack)
```

#### Example Usage

```java
// Invoking the API call with sample inputs
gROUP.getGroupListAsync(new APICallBack<DynamicResponse>() {
    public void onSuccess(HttpContext context, DynamicResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_new_group_async"></a>![Method: ](https://apidocs.io/img/method.png "ke.co.onfonmedia.api.controllers.GROUPController.createNewGroupAsync") createNewGroupAsync

> Create New Group


```java
void createNewGroupAsync(
        final String groupName,
        final APICallBack<DynamicResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| groupName |  ``` Required ```  | Name for new group |


#### Example Usage

```java
String groupName = "GroupName";
// Invoking the API call with sample inputs
gROUP.createNewGroupAsync(groupName, new APICallBack<DynamicResponse>() {
    public void onSuccess(HttpContext context, DynamicResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="update_group_async"></a>![Method: ](https://apidocs.io/img/method.png "ke.co.onfonmedia.api.controllers.GROUPController.updateGroupAsync") updateGroupAsync

> Update Group


```java
void updateGroupAsync(
        final String groupName,
        final String id,
        final APICallBack<DynamicResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| groupName |  ``` Required ```  | Name for new group |
| id |  ``` Required ```  | GroupID |


#### Example Usage

```java
String groupName = "GroupName";
String id = "id";
// Invoking the API call with sample inputs
gROUP.updateGroupAsync(groupName, id, new APICallBack<DynamicResponse>() {
    public void onSuccess(HttpContext context, DynamicResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="create_sub_group_group_async"></a>![Method: ](https://apidocs.io/img/method.png "ke.co.onfonmedia.api.controllers.GROUPController.createSubGroupGroupAsync") createSubGroupGroupAsync

> Create Sub-Group Group


```java
void createSubGroupGroupAsync(
        final String groupName,
        final String id,
        final APICallBack<DynamicResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| groupName |  ``` Required ```  | Name for new group |
| id |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
String groupName = "GroupName";
String id = "Id";
// Invoking the API call with sample inputs
gROUP.createSubGroupGroupAsync(groupName, id, new APICallBack<DynamicResponse>() {
    public void onSuccess(HttpContext context, DynamicResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="delete_group_async"></a>![Method: ](https://apidocs.io/img/method.png "ke.co.onfonmedia.api.controllers.GROUPController.deleteGroupAsync") deleteGroupAsync

> Delete Group


```java
void deleteGroupAsync(
        final int id,
        final APICallBack<DynamicResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| id |  ``` Required ```  | TODO: Add a parameter description |


#### Example Usage

```java
int id = 84;
// Invoking the API call with sample inputs
gROUP.deleteGroupAsync(id, new APICallBack<DynamicResponse>() {
    public void onSuccess(HttpContext context, DynamicResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)

## <a name="campaign_controller"></a>![Class: ](https://apidocs.io/img/class.png "ke.co.onfonmedia.api.controllers.CampaignController") CampaignController

### Get singleton instance

The singleton instance of the ``` CampaignController ``` class can be accessed from the API Client.

```java
CampaignController campaign = client.getCampaign();
```

### <a name="get_campaign_message_status_async"></a>![Method: ](https://apidocs.io/img/method.png "ke.co.onfonmedia.api.controllers.CampaignController.getCampaignMessageStatusAsync") getCampaignMessageStatusAsync

> Get Campaign Message Status


```java
void getCampaignMessageStatusAsync(
        final int campaignId,
        final APICallBack<DynamicResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| campaignId |  ``` Required ```  | First user have to call Get Campaigns api for CampaignId |


#### Example Usage

```java
int campaignId = 84;
// Invoking the API call with sample inputs
campaign.getCampaignMessageStatusAsync(campaignId, new APICallBack<DynamicResponse>() {
    public void onSuccess(HttpContext context, DynamicResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


### <a name="get_campaigns_async"></a>![Method: ](https://apidocs.io/img/method.png "ke.co.onfonmedia.api.controllers.CampaignController.getCampaignsAsync") getCampaignsAsync

> Get Campaigns


```java
void getCampaignsAsync(
        final LocalDate enddate,
        final LocalDate fromdate,
        final int length,
        final int start,
        final APICallBack<DynamicResponse> callBack)
```

#### Parameters

| Parameter | Tags | Description |
|-----------|------|-------------|
| enddate |  ``` Required ```  | Date format must be in yyyy-mm-dd |
| fromdate |  ``` Required ```  | Date format must be in yyyy-mm-dd |
| length |  ``` Required ```  | Ending index value to fetch the campaign detail. |
| start |  ``` Required ```  | Starting index value to fetch the campaign detail. |


#### Example Usage

```java
LocalDate enddate = new Date();
LocalDate fromdate = new Date();
int length = 84;
int start = 84;
// Invoking the API call with sample inputs
campaign.getCampaignsAsync(enddate, fromdate, length, start, new APICallBack<DynamicResponse>() {
    public void onSuccess(HttpContext context, DynamicResponse response) {
        // TODO success callback handler
    }
    public void onFailure(HttpContext context, Throwable error) {
        // TODO failure callback handler
    }
});

```


[Back to List of Controllers](#list_of_controllers)



