/**
           Copyright 2016, James G. Willmore

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

package net.ljcomputing.sr.repository.impl;

import net.ljcomputing.exception.PersistenceException;
import net.ljcomputing.repository.impl.AbstractRepository;
import net.ljcomputing.sr.configuration.Tables;
import net.ljcomputing.sr.model.WorkBreakdownStructure;

/**
 * Work breakdown structure repository implementation.
 * 
 * @author James G. Willmore
 *
 */
public class WorkBreakdownStructureRepositoryImpl
    extends AbstractRepository<WorkBreakdownStructure> {

  /**
   * Instantiates a new work breakdown structure repository impl.
   *
   * @throws PersistenceException the persistence exception
   */
  public WorkBreakdownStructureRepositoryImpl() throws PersistenceException {
    super(Tables.WBS);
  }
}
