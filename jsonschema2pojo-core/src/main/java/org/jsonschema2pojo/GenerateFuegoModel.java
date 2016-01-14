/**
 * Copyright © 2010-2014 Nokia
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

package org.jsonschema2pojo;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import com.sun.codemodel.JCodeModel;

public class GenerateFuegoModel {

    public static void main(String[] args) throws IOException {
        
        // BEGIN EXAMPLE
        
        JCodeModel codeModel = new JCodeModel();
                
        URL source = GenerateFuegoModel.class.getClassLoader().getResource("fuego-response.json");
        new SchemaMapper().generate(codeModel, "FuegoResponse", "com.intuit.ctg.qa.automatedplayer.model", source);
        
        new File("generated-sources").mkdir();
        codeModel.build(new File("generated-sources"));
        
        // END EXAMPLE

    }
    
}
