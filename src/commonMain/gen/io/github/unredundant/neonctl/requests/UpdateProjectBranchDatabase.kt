package io.github.unredundant.neonctl.requests

import io.github.unredundant.neonctl.models.DatabaseUpdateRequest
import io.ktor.client.HttpClient
import io.ktor.client.request.patch
import io.ktor.client.request.setBody
import kotlin.String

/**
 * Updates the specified database in the branch.
 * You can obtain a `project_id` by listing the projects for your Neon account.
 * You can obtain the `branch_id` and `database_name` by listing the branch's databases.
 * For related information, see [Manage databases](https://neon.tech/docs/manage/databases/).
 * Body can be one of the following types:
 * 	- [io.github.unredundant.neonctl.models.DatabaseOperations]
 * 	- [io.github.unredundant.neonctl.models.GeneralError]
 */
public suspend fun HttpClient.updateProjectBranchDatabase(
  body: DatabaseUpdateRequest,
  projectId: String,
  branchId: String,
  databaseName: String,
) = patch("""/projects/$projectId/branches/$branchId/databases/$databaseName""") {
  setBody(body)
}
