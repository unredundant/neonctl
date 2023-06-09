package io.github.unredundant.neonctl.requests

import io.ktor.client.HttpClient
import io.ktor.client.request.delete
import kotlin.String

/**
 * Deletes the specified database from the branch.
 * You can obtain a `project_id` by listing the projects for your Neon account.
 * You can obtain the `branch_id` and `database_name` by listing branch's databases.
 * For related information, see [Manage databases](https://neon.tech/docs/manage/databases/).
 * Body can be one of the following types:
 * 	- [io.github.unredundant.neonctl.models.DatabaseOperations]
 * 	- [io.github.unredundant.neonctl.models.GeneralError]
 */
public suspend fun HttpClient.deleteProjectBranchDatabase(
  projectId: String,
  branchId: String,
  databaseName: String,
) = delete("""/projects/$projectId/branches/$branchId/databases/$databaseName""") {
}
