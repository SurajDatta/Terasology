/*
 * Copyright 2012 Benjamin Glatzel <benjamin.glatzel@me.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.terasology.data.blocks.definitions.plant.leaf

import org.terasology.model.blocks.Block.COLOR_SOURCE

/**
 * This is a leaf, which can exist in the world just as a block of its own
 * However, more likely it will be used by reference by a Tree
 */
block {
    version = 1
    shape = "Cube"
    faces.all = "GreenLeaf"

    hardness = 1

    translucent = true

    colorsource = COLOR_SOURCE.FOLIAGE_LUT
    colorOffset = [0.7f, 0.7f, 0.7f, 1.0f]
}