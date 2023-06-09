package io.github.unredundant.neonctl.requests

import io.ktor.client.HttpClient
import io.ktor.client.request.delete
import kotlin.String

/**
 * Delete the specified endpoint.
 * An endpoint is a Neon compute instance.
 * Deleting an endpoint drops existing network connections to the endpoint.
 * The deletion is completed when last operation in the chain finishes successfully.
 *
 * You can obtain a `project_id` by listing the projects for your Neon account.
 * You can obtain an `endpoint_id` by listing your project's endpoints.
 * An `endpoint_id` has an `ep-` prefix.
 * For more information about endpoints, see [Manage
 * endpoints](https://neon.tech/docs/manage/endpoints/).
 * Body can be one of the following types:
 * 	- [io.github.unredundant.neonctl.models.EndpointOperations]
 * 	- [io.github.unredundant.neonctl.models.GeneralError]
 */
public suspend fun HttpClient.deleteProjectEndpoint(projectId: String, endpointId: String) =
    delete("""/projects/$projectId/endpoints/$endpointId""") {
}
