/*
 * Copyright 2019 Josip Grgurica and Contributors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.github.jkobejs.zio.google.cloud.oauth2.server2server.authenticator

/**
 * Represents config used to connect to Google OAuth 2.0 server.
 *
 * @param uri url used for creating auth requests
 * @param privateKey private key used to sign JWT token
 * @param grantType given grant
 */
final case class AuthApiConfig(
  uri: String,
  privateKey: String,
  grantType: String
)
