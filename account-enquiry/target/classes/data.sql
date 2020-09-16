insert into user_accounts values(1, 'Account1', 'Savings', 500.00, sysdate, 555, sysdate, 'AUD', 123);
insert into user_accounts values(2, 'Account2', 'Savings', 250.00, sysdate, 555, sysdate, 'AUD', 123);

insert into account_transactions values(1, 250.00, sysdate, 'Remarks1', 'CR', 123, 1);
insert into account_transactions values(2, 250.00, sysdate, 'Remarks2', 'CR', 123, 1);
insert into account_transactions values(3, 250.00, sysdate, 'Remarks3', 'CR', 123, 2);
