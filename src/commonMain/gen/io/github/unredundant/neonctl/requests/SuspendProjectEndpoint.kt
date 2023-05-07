package io.github.unredundant.neonctl.requests

import io.ktor.client.HttpClient
import io.ktor.client.request.post
import io.ktor.client.statement.HttpResponse
import kotlin.String

/**
 * Suspend the specified endpoint
 * You can obtain a `project_id` by listing the projects for your Neon account.
 * You can obtain an `endpoint_id` by listing your project's endpoints.
 * An `endpoint_id` has an `ep-` prefix.
 * For more information about endpoints, see [Manage
 * endpoints](https://neon.tech/docs/manage/endpoints/).
 */
public suspend fun HttpClient.suspendProjectEndpoint(projectId: String, endpointId: String):
    HttpResponse = post("""/projects/$projectId/endpoints/$endpointId/suspend""") {
  url {
  }
}
