
#  API Documentation (No Database)

**Base URL:**

`https://monesh-50024353155.development.catalystappsail.in/api`

This REST API allows you to manage student user data mocked. It supports basic CRUD operations (Create, Read, Update, Delete).

---

## 📍 Endpoints

---

### 🔹 GET `/users`

- **Description:** Fetch all student users

### Request

```
GET /api/users

```

### Response Example

```json
[
  {
    "id": 1,
    "name": "Gomo",
    "email": "gomo@example.com",
    "contact": 9876543210
  },
  {
    "id": 2,
    "name": "Monesh",
    "email": "monesh@example.com",
    "contact": 9123456789
  }
]

```

---

### 🔹 GET `/users/{id}`

- **Description:** Fetch a student user by ID

### Request

```
GET /api/users/{id}

```

### Response Example

```json
{
  "id": 1,
  "name": "Gomo",
  "email": "gomo@example.com",
  "contact": 9876543210
}

```

---

### 🔹 POST `/addUser`

- **Description:** Create a new student user

### Request

```
POST /api/addUser
Content-Type: application/json

```

### Request Body Example

```json
{
  "name": "Gomo",
  "email": "gomo@example.com",
  "contact": 9876543210
}

```

### Response Example

```json
{
  "id": 3,
  "name": "Gomo",
  "email": "gomo@example.com",
  "contact": 9876543210
}

```

---

### 🔹 PUT `/users/{id}`

- **Description:** Update an existing student user by ID

### Request

```
PUT /api/users/{id}
Content-Type: application/json

```

### Request Body Example

```json
{
  "name": "Gomo Updated",
  "email": "gomoupdated@example.com",
  "contact": 9123456789
}

```

### Response Example

```json
{
  "id": 3,
  "name": "Gomo Updated",
  "email": "gomoupdated@example.com",
  "contact": 9123456789
}

```

---

### 🔹 DELETE `/users/{id}`

- **Description:** Delete a student user by ID

### Request

```
DELETE /api/users/{id}

```

### Response Example

```json
"User deleted with id: 3"

```

---

## 🧾 Students JSON Object Structure

```json
{
  "id": "Long",
  "name": "String",
  "email": "String",
  "contact": "int"
}

```

