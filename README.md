## API paths

### Get

**Authenticate the user before processing any request**

1. api/message - return messages
2. api/message?last - return message after last variable

### POST

**Authenticate the user before processing any request**
1. api/message - add new message to DB
2. api/login - login a user in system. (set sessionid in cookie, take username from query variable, store sessionid details in server cache (not in chatbot server))

### DELETE

1. api/login - log out a use from the system. (remove sessionid cookie, also mark sessionid as invalid)
