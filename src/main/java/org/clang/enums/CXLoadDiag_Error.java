/*
Copyright 2014-2016 Intel Corporation

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package org.clang.enums;

import org.moe.natj.general.ann.Generated;

/**
 * Describes the kind of error that occurred (if any) in a call to
 * \c clang_loadDiagnostics.
 */
@Generated
public final class CXLoadDiag_Error {
    /**
     * Indicates that no error occurred.
     */
    @Generated public static final int None = 0x00000000;
    /**
     * Indicates that an unknown error occurred while attempting to
     * deserialize diagnostics.
     */
    @Generated public static final int Unknown = 0x00000001;
    /**
     * Indicates that the file containing the serialized diagnostics
     * could not be opened.
     */
    @Generated public static final int CannotLoad = 0x00000002;
    /**
     * Indicates that the serialized diagnostics file is invalid or
     * corrupt.
     */
    @Generated public static final int InvalidFile = 0x00000003;

    @Generated
    private CXLoadDiag_Error() {
    }
}
