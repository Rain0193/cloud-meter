/**
 * The Testplan Component
 */
import { BackendService } from '../backend.service';
import { Component } from '@angular/core';

import { TestElement } from './testelement';
import { TestElementNode } from './testelement';

@Component({
  selector: 'app-testplan',
  templateUrl: './testplan.component.html',
  styleUrls: ['./testplan.component.css'],
  providers: [BackendService]
})

export class TestplanComponent {
  testplan: TestElementNode[];
  selectedNode: TestElementNode;

  private _opened = true;
  private _mode = 'push';

  constructor() {
    this.testplan = defaultTestPlan();
  }

  private onSelect(node: TestElementNode) {
    console.log('called onSelect()');
    this.selectedNode = node;
  }

  private getMode(): string {
    return 'push';
  }

}

function defaultTestPlan() {
  const tp: TestElementNode[] = [];

  let node = new TestElementNode();
  node.elementType = 'testplan';
  node.element = new TestElement();
  node.setName('TestPlan');
  tp[0] = node;

  node = new TestElementNode();
  node.elementType = 'workbench';
  node.element = new TestElement();
  node.setName('WorkBench');
  tp[1] = node;


  return tp;
}


