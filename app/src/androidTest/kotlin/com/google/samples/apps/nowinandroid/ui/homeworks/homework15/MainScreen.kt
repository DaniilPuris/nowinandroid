/*
 * Copyright 2025 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.samples.apps.nowinandroid.ui.homeworks.homework15

import androidx.compose.ui.test.SemanticsNodeInteractionsProvider
import androidx.compose.ui.test.hasTestTag
import io.github.kakaocup.compose.node.element.ComposeScreen
import io.github.kakaocup.compose.node.element.KNode
import com.google.samples.apps.nowinandroid.core.designsystem.C

class MainScreen(semanticsProvider: SemanticsNodeInteractionsProvider? = null) :
    ComposeScreen<MainScreen>(semanticsProvider) {

    val navigationIcon = Child<KNode> {
        hasTestTag(C.NAVIGATION_ICON_BUTTON)
    }

    val topAppBarTitle = Child<KNode> {
        hasTestTag(C.TOP_APP_BAR_TITLE)
    }

    val settingsIconButton = Child<KNode> {
        hasTestTag(C.SETTINGS_ICON_BUTTON)
    }

    val columnTitle = Child<KNode> {
        hasTestTag(C.COLUMN_TITLE)
    }

    val columnSubtitle = Child<KNode> {
        hasTestTag(C.COLUMN_SUBTITLE)
    }

    val niaButton = Child<KNode> {
        hasTestTag(C.NIA_BUTTON)
    }
}