# code-ace-12

### Commands for ACE

* Create integration server with ACE Console

`mqsicreateworkdir C:\ACEIBM\intservers\is1`

* Run integration server

`IntegrationServer --name ACE_NODE --work-dir C:\ACEIBM\intservers\is1`

* Activate debug port for integration server

`mqsichangeproperties ACE_NODE -e server1 -o ComIbmJVMManager -n jvmDebugPort -v 3920`

* Connect with remote MQ

`mqsisetdbparms -w C:\ACEIBM\intservers\is1 -n mq::QMGR::QM1 -u admin -p passw0rd`

