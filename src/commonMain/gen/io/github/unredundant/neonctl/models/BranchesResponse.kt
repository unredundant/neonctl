package io.github.unredundant.neonctl.models

import kotlin.collections.List
import kotlinx.serialization.Serializable

@Serializable
public data class BranchesResponse(
  public val branches: List<Branch>,
)
